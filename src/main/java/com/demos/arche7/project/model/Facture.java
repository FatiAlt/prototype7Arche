package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="facture")
public class Facture {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private float prixHt;
    private double tva = 0.2;
    private float prixTtc;


    public Facture(Long id, Date date, float prixHt, double tva, float prixTtc) {
        this.id = id;
        this.date = date;
        this.prixHt = prixHt;
        this.tva = tva;
        this.prixTtc = prixTtc;
    }

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
