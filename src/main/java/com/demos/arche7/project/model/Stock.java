package com.demos.arche7.project.model;

import com.demos.arche7.project.exception.StockException;
import jakarta.persistence.Embeddable;

@Embeddable

public class Stock {
    private int quantiteTotal;

    public Stock() {

    }

    /**
     *
     * @param quantiteTotal nombre de stock total
     */
    public Stock(int quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    /**
     * définit la totalité du stock
     * @return
     */
    public int getQuantiteTotal() {
        return quantiteTotal;
    }

    /**
     *
     * @param quantiteTotal définit la quantité du stock
     */
    public void setQuantiteTotal(int quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    /**
     *
     *  incrémente l'article dans le stock en y ajoutant une valeur
     *  @param ajout Ajoute la valeur dans le stock
     */

    public void incremente(int ajout) {
        quantiteTotal += ajout;
    }

    /**
     *
     * @param retire décrémente la quantité en stock
     * @throws StockException en cas de stock insuffisant, renvoi un message
     */

    public void decremente(int retire) throws StockException {
        if (retire <= quantiteTotal) {
            quantiteTotal -= retire;
        } else {
            throw new StockException("stock insuffisant");
        }
    }
}
