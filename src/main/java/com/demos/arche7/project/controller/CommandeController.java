package com.demos.arche7.project.controller;


import com.demos.arche7.project.repository.CommandeRepository;
import com.demos.arche7.project.service.Commande.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commande")
@CrossOrigin
public class CommandeController {
    @Autowired
    private final CommandeService commandeService;
    @Autowired
    private final CommandeRepository commandeRepository;


    public CommandeController(CommandeService commandeService, CommandeRepository commandeRepository) {
        this.commandeService = commandeService;
        this.commandeRepository = commandeRepository;
    }
    @PostMapping()

}
