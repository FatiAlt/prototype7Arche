package com.demos.arche7.project.model;

import jakarta.persistence.*;


public class LignePanier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    protected Long id;
/*    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;*/

    private int qteVoulue;


    public LignePanier(Article article, int qteVoulue) {
//        this.article = article;
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

}
