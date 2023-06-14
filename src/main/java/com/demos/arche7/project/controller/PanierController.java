package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.PanierRepository;
import com.demos.arche7.project.service.Panier.PanierService;
import exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/panier")
@CrossOrigin
public class PanierController {
    @Autowired
    private PanierService panierService;
    @Autowired
    private PanierRepository panierRepository;

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
    }
