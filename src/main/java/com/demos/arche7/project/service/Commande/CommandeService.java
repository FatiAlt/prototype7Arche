package com.demos.arche7.project.service.Commande;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Commande;
import com.demos.arche7.project.exception.StockException;


 public interface CommandeService {
    Iterable<Commande> getAllCommandes();

    Commande saveCommande(Commande commande);


    public void creeCommande(Article article, int qteVoulue) throws StockException;







}
