package com.demos.arche7.project.model;

import com.demos.arche7.project.exception.StockException;
import jakarta.persistence.Embeddable;

@Embeddable
public class Stock {
    private int qteTotal;

    public Stock() {

    }

    /**
     *
     * @param quantiteTotal nombre de stock total
     */
    public Stock(int quantiteTotal) {
        this.qteTotal = quantiteTotal;
    }

    /**
     * définit la totalité du stock
     * @return
     */
    public int getQteTotal() {
        return qteTotal;
    }

    /**
     *
     * @param quantiteTotal définit la quantité du stock
     */
    public void setQteTotal(int quantiteTotal) {
        this.qteTotal = quantiteTotal;
    }

    /**
     *
     *  incrémente l'article dans le stock en y ajoutant une valeur
     *  @param ajout Ajoute la valeur dans le stock
     */

    public void incremente(int ajout) {
        qteTotal += ajout;
    }

    /**
     *
     * @param retire décrémente la quantité en stock
     * @throws StockException en cas de stock insuffisant, renvoi un message
     */

    public void decremente(int retire) throws StockException {
        if (retire <= qteTotal) {
            qteTotal -= retire;
        } else {
            throw new StockException("stock insuffisant");
        }
    }
}
