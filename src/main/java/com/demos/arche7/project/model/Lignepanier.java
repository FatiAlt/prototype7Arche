package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="ligne_panier")
public class Lignepanier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private int qteVoulue;

    public Lignepanier(Long id, int qteVoulue) {
        this.id = id;
        this.qteVoulue = qteVoulue;
    }

    public Lignepanier() {

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
