package com.demos.arche7.project.model;

import jakarta.persistence.*;


@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    protected Long id;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;
    private int qteVoulue;
    private float prixHt;
    private float prixTtc;

    @ManyToOne
    @JoinColumn(name="commande_id")
    private Commande commande;


    public LigneCommande() {
    }

    public LigneCommande(Long id, Article article, int qteVoulue, float prixHt, float prixTtc, Commande commande) {
        this.id = id;
        this.article = article;
        this.qteVoulue = qteVoulue;
        this.prixHt = prixHt;
        this.prixTtc = prixTtc;
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQteVoulue() {
        return qteVoulue;
    }

    public void setQteVoulue(int qteVoulue) {
        this.qteVoulue = qteVoulue;
    }

    public float getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(float prixHt) {
        this.prixHt = prixHt;
    }

    public float getPrixTtc() {
        return prixTtc;
    }

    public void setPrixTtc(float prixTtc) {
        this.prixTtc = prixTtc;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
