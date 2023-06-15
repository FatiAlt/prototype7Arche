package com.demos.arche7.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adresse")
public class Adresse {
	@Id
	@GeneratedValue
	private Long id;
	private int numero;
	private String nomRue;
	private int codePostal;
	private String ville;

	public Adresse(Long id, int numero, String nomRue, int codePostal, String ville) {
		this.id = id;
		this.numero = numero;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse() {
	}

	public Long getId() {
		return id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", numero=" + numero +
                ", nomRue='" + nomRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
