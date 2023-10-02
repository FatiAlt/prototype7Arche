package com.demos.arche7.project.service.commande;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Commande;
import com.demos.arche7.project.model.LigneCommande;
import com.demos.arche7.project.repository.ArticleRepository;
import com.demos.arche7.project.repository.CommandeRepository;
import com.demos.arche7.project.exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ArticleRepository articleRepository;



    @Override
    public Iterable<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void creeCommande(Article article, int qteVoulue) throws StockException {

    }

    /*   @Override
       public Commande saveCommande(Commande commande) {
           return commandeRepository.save(commande);
       }
       // cette fonction permet de calculer le stock los de la création de la commande, inclus l'exception avec message en cas de stock insuffisant
       @Transactional(rollbackFor = StockException.class)
       public void creeCommande(Article article, int qteVoulue) throws StockException {
           Commande commande = new Commande(article,qteVoulue);
           commandeRepository.save(commande);
           // on complète l'exception avec la désignation de l'article
           try {
               article.getStock().decremente(qteVoulue);
           }
           catch(StockException ex){
               throw new StockException(ex.getMessage() + " " + article.getDesignation());
           }
           articleRepository.save(article);


       }*/
    @Transactional(rollbackFor = StockException.class)
    public void creeCommande(Commande commande) throws StockException {
        for (LigneCommande lc:commande.getContenu()){
            // on récupère l'id de l'article transmis dans la requête en JSON
            long idArticle = lc.getArticle().getId();
            // on recherche l'article en base pour retrouver l'article complet
            Optional<Article> article1 = articleRepository.findById(idArticle);
            // on modifie la ligne de commande avec l'article retrouvé
            if (article1.isPresent()) {
                Article article = article1.get();
                lc.setArticle(article);
                try {
                    article.getStock().decremente(lc.getQteVoulue());
                }
                catch(StockException ex){
                    throw new StockException(ex.getMessage() + " " + article.getDesignation());
                }
                articleRepository.save(article);
            }
            else {
                throw new RuntimeException ("id erroné d'article");
            }
        }
        commandeRepository.save(commande);

    }

}
