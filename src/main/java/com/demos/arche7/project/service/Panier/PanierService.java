package com.demos.arche7.project.service.Panier;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Panier;
import com.demos.arche7.project.exception.StockException;

public interface PanierService {
    Panier savePanier(Panier panier);

    public void creePanier(Article article, int qteVoulue) throws StockException;

}
