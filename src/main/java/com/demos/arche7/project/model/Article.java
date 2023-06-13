package com.demos.arche7.project.model;
import jakarta.persistence.*;

@Entity
@Table(name = "articles")
@Inheritance(strategy=InheritanceType.JOINED)

public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id", nullable = false)
        protected Long id;
        @Column(name = "reference", nullable = false, length = 30, unique = true)
        private String ref;
        @Column(name = "designation")
        private String designation;
        @Column(name = "prix_ht")
        private double prixHt;
        @Column(name = "tva")
        private double tva = 0.2;
        @Column(name="type")
        private String type;
        @Column(name="format")
        private String format;
        @Column(name="resume")
        private String resume;
        @Column(name = "art_num")
        private  boolean articleNumerique;//cet attribu permet de vérifier si l'article est physique ou numérique


        public Article(Long id, String ref, String designation, double prixHt, double tva, String type, String format, String resume, boolean articleNumerique, Stock stock) {
            this.id = id;
            this.ref = ref;
            this.designation = designation;
            this.prixHt = prixHt;
            this.tva = tva;
            this.type = type;
            this.format = format;
            this.resume = resume;
            this.articleNumerique = articleNumerique;
            this.stock = stock;
        }

        public Article() {

        }
    // Stock est une classe embarqué(embeded), sa valeur est insérée dans l'article donc pas d'associé la table
        @Embedded
        @AttributeOverrides({
                @AttributeOverride( name = "qte_voulue", column = @Column(name = "stock"))
    })
        private Stock stock;

    @ManyToOne()
        @JoinColumn(name="ligne_Commande_id")
        private LigneCommande ligneCommande;

    public LigneCommande getLigneCommande() {
        return ligneCommande;
    }

    public void setLigneCommande(LigneCommande ligneCommande) {
        this.ligneCommande = ligneCommande;
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

        //permet de calculer le prix ht et tva et apparaitra dans l'objet json, pas d'attribut ttc.
     public double getPrixTTC() {
        return prixHt*(1+tva);
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
                    ", image='" + type + '\'' +
                    ", format='" + format + '\'' +
                    "resume='" + resume + '\'' +
                    '}';
        }


    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}

