package com.demos.arche7.project.service.Commande;

import com.demos.arche7.project.model.Commande;
import com.demos.arche7.project.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class CommandeServiceImpl implements CommandeService {


    @Autowired
    CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Iterable<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }


}
