package com.demos.arche7.project.service.stock;

public interface StockService {

    boolean ajouterArticle(String article, int quantite);


    void enleverStock(String article, int quantite);

    boolean decrementeStock(String articleId, int decrementAmount);
}
