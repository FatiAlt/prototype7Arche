package com.demos.arche7.project.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

    @Entity
    @Table(name="editeur")
    public class Editeur {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        protected Long id;
        private String nomEditeur;

        public Editeur(Long id, String nomEditeur) {
            this.id = id;
            this.nomEditeur = nomEditeur;
        }

        public Editeur() {

        }

        public Long getId() {
            return id;
        }

        public String getNomEditeur() {
            return nomEditeur;
        }

        public void setNomEditeur(String nomEditeur) {
            this.nomEditeur = nomEditeur;
        }

        @Override
        public String toString() {
            return "Editeur{" +
                    "id=" + id +
                    ", nomEditeur='" + nomEditeur + '\'' +
                    '}';
        }
    }


