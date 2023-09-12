package com.demos.arche7.project.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "date_commande")
    private Date dateCommande;
    @Column(name = "qte_voulue")
    private int qteVoulue;
    @Column(name = "prix_total_ht")
    private double prixTotalHt;
    @Column(name = "prix_total_ttc")
    private double prixTotalTtc;

    public Commande(Long id, Date dateCommande, int qteVoulue, double prixTotalHt, double prixTotalTtc) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.qteVoulue = qteVoulue;
        this.prixTotalHt = prixTotalHt;
        this.prixTotalTtc = prixTotalTtc;
    }

    /**@param contenu contient la liste des commandes
     * @method avec la méthode fetch permet de récupérer les données de la commande au fur et à mesure
     *
     */
    // cascade pour entraîner également la persistance des associations
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "commande")
    private List<LigneCommande> contenu;

    {
        contenu = new ArrayList<>();
    }

    public Commande() {

    }

    // constructeur ne prenant en compte qu'un seul article
    public Commande(Article article, int qteVoulue) {
        LigneCommande lc;
        lc = new LigneCommande();
        contenu.add(lc);
        // methode qui permet de faire le lien entre commande et ligne commande
        lc.setCommande(this);

    }

    public Long getId() {
        return id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public int getQteVoulue() {
        return qteVoulue;
    }

    public void setQteVoulue(int qteVoulue) {
        this.qteVoulue = qteVoulue;
    }

    public double getPrixTotalHt() {
        return prixTotalHt;
    }

    public void setPrixTotalHt(double prixTotalHt) {
        this.prixTotalHt = prixTotalHt;
    }

    public double getPrixTotalTtc() {
        return prixTotalTtc;
    }

    public void setPrixTotalTtc(double prixTotalTtc) {
        this.prixTotalTtc = prixTotalTtc;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateCommande=" + dateCommande +
                ", qteVoulue=" + qteVoulue +
                ", prixTotalHt=" + prixTotalHt +
                ", prixTotalTtc=" + prixTotalTtc +
                '}';
    }

    public LigneCommande[] getContenu() {
        return new LigneCommande[0];
    }
}


