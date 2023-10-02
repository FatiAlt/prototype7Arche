import product1 from "./assets/img/1.jpg";
import product2 from "./assets/img/2.jpg";
import product3 from "./assets/img/3.jpg";
import product4 from "./assets/img/4.jpg";
import product5 from "./assets/img/5.jpg";
import product6 from "./assets/img/6.jpg";
import product7 from "./assets/img/7.jpg";
import product8 from "./assets/img/8.jpg";
import product9 from "./assets/img/9.jpeg";
import product10 from "./assets/img/10.jpg";

 const PRODUCTS =  ([
  {
    id: 1,
    titre: "Anti guide du cinéma",
    auteur: "Jean-Sébastien Le Roux",
    prix: 22,
    img: product1,
    amount: 1,
  },
  
  {
    id: 2,
    titre: "Les meilleurs livres sur le cinéma",
    auteur: "",
    prix: 125.00,
    productImage: product2,
    amount: 2,
  },
  {
    id: 3,
    titre: "Chroniques d'art du spectacle",
    auteur: "François Truffault",
    prix: 69.00,
    productImage: product3,
    amount: 3,
  },
  {
    id: 4,
    titre: "Histoire du cinéma français",
    auteur: "",
    prix: 29.90,
    productImage: product4,
    amount: 4,
  },
  {
    id: 5,
    titre: "Tout sur le cinéma",
    auteur: "",
    prix: 19.99,
    productImage: product5,
    amount: 5,
  },
  {
    id: 6,
    titre: "Le cinéma italien",
    auteur: "Jean Gili",
    prix: 38.00,
    productImage: product6,
    amount: 2,
  },
  {
    id: 7,
    titre: "Cinéma Radical",
    auteur: "Christian Lebras",
    prix: 120.0,
    productImage: product7,
    amount: 7,
  },
  {
    id: 8,
    titre: "Tout sur le cinéma, tome 2",
    auteur: "",
    prix: 40.0,
    productImage: product8,
    amount: 8,
  },
  {
    id: 9,
    titre: "Histoire et cinéma",
    auteur: "Robert Mandrou",
    prix: 46.20,
    productImage: product9,
    amount: 9,
  },
  {
    id: 10,
    titre: "Films des années 40",
    auteur: "Jurgen Muller",
    prix: 150.0,
    productImage: product10,
    amount: 10,
  },


]);

export default PRODUCTS;