package com.demos.arche7.project.exception;

/**
 * Cette classe gère les exceptions en cas d'insuffisance au niveau du stock
 */
public class StockException extends Exception{
    public StockException (String message) {
        super (message);
    }
}
