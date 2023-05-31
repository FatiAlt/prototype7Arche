package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {
    @Id
    @GeneratedValue
    private Long id;

    public Genre(Long id) {
        this.id = id;
    }

    public Genre() {

    }

    public Long getId() {
        return id;
    }


}
