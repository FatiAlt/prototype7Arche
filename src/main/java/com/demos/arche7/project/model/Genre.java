package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String nom;

    public Genre(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Genre() {

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }


}
