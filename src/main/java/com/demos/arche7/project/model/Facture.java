package com.demos.arche7.project.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "prix_ht")
    private float prixHt;
    @Column(name = "tva")
    private double tva = 0.2;
    @Column(name = "prix_ttc")
    private float prixTtc;


    public Facture(Long id, Date date, float prixHt, double tva, float prixTtc) {
        this.id = id;
        this.date = date;
        this.prixHt = prixHt;
        this.tva = tva;
        this.prixTtc = prixTtc;
    }
    @OneToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    public Facture() {
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                ", date=" + date +
                ", prixHt=" + prixHt +
                ", tva=" + tva +
                ", prixTtc=" + prixTtc +
                '}';
    }
}
