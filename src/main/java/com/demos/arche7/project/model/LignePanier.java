package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="ligne_panier")
public class LignePanier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    protected Long id;
    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;

    private int qteVoulue;
    @ManyToOne
    @JoinColumn(name="panier_id")
    private Panier panier;

    public LignePanier(Article article, int qteVoulue) {
        this.article = article;
        this.qteVoulue = qteVoulue;
    }
    public LignePanier() {
    }

    public Long getId() {
        return id;
    }
    public int getQteVoulue() {
        return qteVoulue;
    }
    public void setQteVoulue(int qteVoulue) {
        this.qteVoulue = qteVoulue;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }
}
