package com.demos.arche7.project.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date dateFacture;
    @Column(name = "prix_ht")
    private float prixHt;
    @Column(name = "tva")
    private double tva = 0.2;
    @Column(name = "prix_ttc")
    private float prixTtc;
    @OneToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;


    public Facture(Long id, Date date, float prixHt, double tva, float prixTtc, Commande commande) {
        this.id = id;
        this.dateFacture = date;
        this.prixHt = prixHt;
        this.tva = tva;
        this.prixTtc = prixTtc;
        this.commande = commande;
    }


    public Facture() {
    }

    public Long getId() {
        return id;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date date) {
        this.dateFacture = date;
    }

    public float getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(float prixHt) {
        this.prixHt = prixHt;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public float getPrixTtc() {
        return prixTtc;
    }

    public void setPrixTtc(float prixTtc) {
        this.prixTtc = prixTtc;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + dateFacture +
                ", prixHt=" + prixHt +
                ", tva=" + tva +
                ", prixTtc=" + prixTtc +
                '}';
    }
}
