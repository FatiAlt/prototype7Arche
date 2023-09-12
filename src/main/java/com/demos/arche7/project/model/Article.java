package com.demos.arche7.project.model;

import jakarta.persistence.*;

/**
 *  Cette classe article est le point d'entrée de la V1 où seule la vente de livre sera proposé
 * Cette classe a été crée dès la conception du site pour intégrer la V2 dans le futur en fonction du succès
 */
@Entity
@Table(name = "article")
@Inheritance(strategy = InheritanceType.JOINED)


public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "reference", length = 30, unique = true)
    private String ref;
    @Column(name = "designation")
    private String designation;
    @Column(name = "prix_ht")
    private double prixHt;
    @Column(name = "tva")
    private double tva = 0.2;
    @Column(name = "resume")
    private String resume;
    @Column(name = "art_num")
    private boolean articleNumerique;//cet attribu permet de vérifier si l'article est physique ou numérique
    @Column(name = "image")
    private String image;
    /** Stock est une classe embarqué(embeded), sa valeur est insérée dans l'article donc pas associé à la table*/
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "stock", column = @Column(name = "quantite_total"))
    })
    private Stock stock;

   /**
    * Constructeur possèdant les attributs cités plus haut
    * @param articleNumerique renvoi un boolean pour la commande d'articles numériques
    * @param prixHt et tva, ils se calculent automatiquement
    * @see #getPrixHt()
    */
    public Article(Long id, String ref, String designation, double prixHt, double tva, String resume, boolean articleNumerique, Stock stock, String image) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prixHt = prixHt;
        this.tva = tva;
        this.resume = resume;
        this.articleNumerique = articleNumerique;
        this.stock = new Stock();
        this.image = image;

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

    public double getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(double prixHt) {
        this.prixHt = prixHt;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    //permet de calculer le prix ht avec tva et apparaitra dans l'objet json, pas d'attribut ttc.
    public double getPrixTTC() {
        return prixHt * (1 + tva);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", designation='" + designation + '\'' +
                ", prixHt=" + prixHt +
                ", tva=" + tva +
                "resume='" + resume + '\'' +
                '}';
    }


    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public boolean isArticleNumerique() {
        return articleNumerique;
    }

    public void setArticleNumerique(boolean articleNumerique) {
        this.articleNumerique = articleNumerique;
    }
}

