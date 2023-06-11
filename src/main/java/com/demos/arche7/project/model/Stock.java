package com.demos.arche7.project.model;

import exception.StockException;
import jakarta.persistence.Embeddable;

@Embeddable

public class Stock {
    private int quantiteTotal;

    public Stock() {

    }
    public Stock(int quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    public int getQuantiteTotal() {
        return quantiteTotal;
    }

    public void setQuantiteTotal(int quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }



    public void incremente(int entree) {
        quantiteTotal += entree;
    }

    public void decremente(int sortie) throws StockException {
        if (sortie <= quantiteTotal) {
            quantiteTotal -= sortie;
        } else {
            throw new StockException("stock insuffisant");
        }
    }
}
