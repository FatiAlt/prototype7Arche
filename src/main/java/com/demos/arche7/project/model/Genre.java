package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nomGenre;

    public Genre(Long id, String nomGenre) {
        this.id = id;
        this.nomGenre = nomGenre;
    }

    public Genre() {

    }
    public String getNomGenre() {
        return nomGenre;
    }

    public void setNomGenre(String nom) {
        this.nomGenre = nom;
    }

    public Long getId() {
        return id;
    }


}
