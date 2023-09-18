package com.demos.arche7.project.exception;


public class AdresseException extends Exception {

    /**
     *
     * @param message affiche un message d'exception en cas d'erreur
     * @return un message d'erreur
     */
    public AdresseException (String message) {
        super (message);
    }
}
