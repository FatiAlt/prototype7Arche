package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.CommandeRepository;
import com.demos.arche7.project.service.Commande.CommandeService;
import com.demos.arche7.project.exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/commande")
@CrossOrigin
public class CommandeController {
    @Autowired
    private CommandeService commandeService;
    @Autowired
    private CommandeRepository commandeRepository;

    @PostMapping()
    //Créer une fonction qui test la première commande avec le stock, qui est pour l'instant insuffisant
    public void essaiCreationCommande() {
        System.out.println("essai création commande");
        // première commande échoue cause du stock
        Optional<Article> article1 = commandeRepository.findById(3);
        if (article1.isPresent()) {
            try {
                System.out.println("commande de " + article1.get().getDesignation());
                commandeService.creeCommande(article1.get(), 2);
            } catch (StockException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("pb optional 1");
        }
        // deuxième commande correcte
        Optional<Article> article2 = commandeRepository.findById(2);
        if (article2.isPresent()) {
            try {
                System.out.println("commande de " + article2.get().getDesignation());
                commandeService.creeCommande(article2.get(), 1);
            } catch (StockException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
                System.out.println("pb optional 2");
            }
        }

    }
    /*    @PostMapping()
    public void essaiCreationPanier() {
        System.out.println("appel création panier");
        //  client choisi un article pour le mettre dans le panier mais c'est un échec car stock insuffisant
        Optional<Article> article1 = panierRepository.findById(7);
        if (article1.isPresent()) {
            try {
                System.out.println("panier " + article1.get().getDesignation());
                panierService.creePanier(article1.get(), 7);
            } catch (StockException ex) {
                System.out.println(ex.getMessage());
            }
        } else{
                System.out.println("pb optional 1");
            }

        }*/




