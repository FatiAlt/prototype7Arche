package com.demos.arche7.project.service.Panier;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Panier;
import com.demos.arche7.project.repository.PanierRepository;
import com.demos.arche7.project.exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierServiceImpl implements PanierService{
    @Override
    public Panier savePanier(Panier panier) {
        return null;
    }

    @Override
    public void creePanier(Article article, int qteVoulue) throws StockException {

    }
/*    @Autowired
    private PanierRepository panierRepository;
    @Override
        public Panier savePanier(Panier panier) {
            return panierRepository.save(panier);
        }

    @Override
    public void creePanier(Article article, int qteVoulue) throws StockException {

    }*/
}

