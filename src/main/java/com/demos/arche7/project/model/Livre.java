package com.demos.arche7.project.model;

import jakarta.persistence.*;
/**
 * Cette classe est hérité de la classe article, la version comportera uniquement les livres
 */
@Entity
@Table(name = "livre")
@PrimaryKeyJoinColumn(name="id")
public class Livre extends Article {
    @Column(name = "titre")
    private String titre;
    @Column(name = "format")
    private String format;
    @Column(name = "isbn13")
    private String numeroIsbn13;
    @Column(name = "nb_page")
    private int nbPage;
   @ManyToOne
   @JoinColumn(name="auteur_id")
    private Auteur auteur;
   @OneToOne
   @JoinColumn(name="editeur_id")
   private Editeur editeur;
   @ManyToOne
   @JoinColumn(name="genre_id")
   private Genre genre;

    public Livre(String titre, String format, String numeroIsbn13, int nbPage, Auteur auteur, Editeur editeur, Genre genre) {
        this.titre = titre;
        this.format = format;
        this.numeroIsbn13 = numeroIsbn13;
        this.nbPage = nbPage;
        this.auteur = auteur;
        this.editeur = editeur;
        this.genre = genre;
    }

    public Livre() {

    }

    @Override
    public void setTva(double tva) {
        super.setTva(tva);
    }

    @Override
    public double getPrixTTC() {
        return super.getPrixTTC();
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


