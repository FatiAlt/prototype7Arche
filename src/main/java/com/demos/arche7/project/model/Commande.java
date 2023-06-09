package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="commande")
public class Commande {

    @Id
    @GeneratedValue
    private Long id;
    private Date dateCommande;
    private int qteVoulue;
    private float prixTotalHt;
    private float prixTotalTtc;

    public Commande(Long id, Date dateCommande, int qteVoulue, float prixTotalHt, float prixTotalTtc) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.qteVoulue = qteVoulue;
        this.prixTotalHt = prixTotalHt;
        this.prixTotalTtc = prixTotalTtc;
    }

    public Commande() {

    }

    public Long getId() {
        return id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public int getQteVoulue() {
        return qteVoulue;
    }

    public void setQteVoulue(int qteVoulue) {
        this.qteVoulue = qteVoulue;
    }

    public float getPrixTotalHt() {
        return prixTotalHt;
    }

    public void setPrixTotalHt(float prixTotalHt) {
        this.prixTotalHt = prixTotalHt;
    }

    public float getPrixTotalTtc() {
        return prixTotalTtc;
    }

    public void setPrixTotalTtc(float prixTotalTtc) {
        this.prixTotalTtc = prixTotalTtc;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateCommande=" + dateCommande +
                ", qteVoulue=" + qteVoulue +
                ", prixTotalHt=" + prixTotalHt +
                ", prixTotalTtc=" + prixTotalTtc +
                '}';
    }
}
