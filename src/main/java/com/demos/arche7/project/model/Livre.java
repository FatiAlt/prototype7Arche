package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
@PrimaryKeyJoinColumn(name="id")
public class Livre extends Article {

    private String titre;
    private String format;
    private String numeroIsbn13;
    private int nbPage;

    public Livre(String titre, String format, double tva, String numeroIsbn13, int nbPage) {
        this.titre = titre;
        this.format = format;
        this.numeroIsbn13 = numeroIsbn13;
        this.nbPage = nbPage;
    }

    public Livre() {

    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String auteur) {
        this.format = auteur;
    }

    public String getNumeroIsbn13() {
        return numeroIsbn13;
    }

    public void setNumeroIsbn13(String numeroIsbn13) {
        this.numeroIsbn13 = numeroIsbn13;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }
}


