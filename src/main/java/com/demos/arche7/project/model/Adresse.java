package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="adresse")
@PrimaryKeyJoinColumn(name = "id")

public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id")
	protected Long id;
	@Column(name = "N°")
	private int numero;
	@Column(name = "rue")
	private String nomRue;
	@Column(name = "code_postal")
	private int codePostal;
	@Column(name = "ville")
	private String ville;

	public Adresse(Long id, int numero, String nomRue, int codePostal, String ville, Client client) {
		this.id = id;
		this.numero = numero;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.client = client;
	}


	@OneToOne
	@JoinColumn(name = "id_client")
	private Client client;


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
