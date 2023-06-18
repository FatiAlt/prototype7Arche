package com.demos.arche7.project.service.Editeur;

import com.demos.arche7.project.model.Editeur;
import com.demos.arche7.project.repository.EditeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EditeurServiceImpl implements EditeurService{
    @Autowired
    private EditeurRepository editeurRepository;
    @Override
    public Iterable<Editeur> getAllEditeurs() {
        return editeurRepository.findAll();
    }

    @Override
    public Editeur saveEditeur(Editeur editeur) {
        return editeurRepository.save(editeur);
    }
    @Override
    public List<Editeur> findByNomEditeur(String nomEditeur) {
        return editeurRepository.findByNomEditeur(nomEditeur);
    }
}
