package com.demos.arche7.project.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="panier")

public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
   protected Long id;
    private int qteTotal;
    private double prixTotalHt;
    private double prixTotalTtc;
    public Panier(Long id, int qteTotal, double prixTotalHt, double prixTotalTtc) {
        this.id = id;
        this.qteTotal = qteTotal;
        this.prixTotalHt = prixTotalHt;
        this.prixTotalTtc = prixTotalTtc;

    }

    public Panier() {

    }

    public Long getId() {
        return id;
    }
    public int getQteTotal() {
        return qteTotal;
    }

    public void setQteTotal(int qteTotal) {
        this.qteTotal = qteTotal;
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
/*    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "panier")
    private List<LignePanier> ajout;

    {
        ajout = new ArrayList<>();
    }
    public void setPrixTotalTtc(double prixTotalTtc) {
        this.prixTotalTtc = prixTotalTtc;
    }
    // constructeur ne prenant en compte qu'un seul article
    public Panier(Article article, int qte_voulue) {
        LignePanier lp = new LignePanier(article,qte_voulue);
        ajout.add(lp);
        // important de faire le lien entre panier et ligne panier
        lp.setPanier(this);

    }*/
}
