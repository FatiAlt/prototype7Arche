package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ref;
    private String designation;
    private float prixHt;
    private double tva = 0.2;
    private String type;
    private String format;

    private String resume;


    public Article(Long id, String ref, String designation, float prixHt, double tva, String type, String format, String resume) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prixHt = prixHt;
        this.tva = tva;
        this.type = type;
        this.format = format;
        this.resume = resume;
    }

    public Article() {

    }

    public Long getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getType() {
        return type;
    }

    public void setType(String image) {
        this.type = image;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getResume() { return resume; }

    public void setResume(String resume) { this.resume = resume; }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", designation='" + designation + '\'' +
                ", prixHt=" + prixHt +
                ", tva=" + tva +
                ", image='" + type + '\'' +
                ", format='" + format + '\'' +
                "resume='" + resume + '\'' +
                '}';
    }


}