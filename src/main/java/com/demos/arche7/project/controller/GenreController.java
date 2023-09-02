package com.demos.arche7.project.controller;


import com.demos.arche7.project.model.Genre;
import com.demos.arche7.project.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
@CrossOrigin
public class GenreController {
    @Autowired
    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }


    @PostMapping("/save")
    public Genre addGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

}


