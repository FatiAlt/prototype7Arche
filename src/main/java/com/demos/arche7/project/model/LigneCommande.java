package com.demos.arche7.project.model;

import jakarta.persistence.*;


@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;
    private int qteVoulue;


    @ManyToOne
    @JoinColumn(name="commande_id")
    private Commande commande;

    //constructeur vide permet à hibernate d'instancier les objects
    public LigneCommande() {

    }

    public LigneCommande(Article article, int qteVoulue) {
        this.article = article;
        this.qteVoulue = qteVoulue;

    }

    public int getQteVoulue() {
        return qteVoulue;
    }

    public void setQteVoulue(int qteVoulue) {
        this.qteVoulue = qteVoulue;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    /**
     * @param article permet de récupérer les articles existants dans la base
     */
    public void setArticle(Article article) {
        this.article = article;
    }

    //rechercher les articles existants dans la base qui permet de le récupérer chez le client avec findById
}
