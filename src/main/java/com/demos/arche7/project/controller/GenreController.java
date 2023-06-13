package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Genre;
import com.demos.arche7.project.repository.GenreRepository;
import com.demos.arche7.project.service.Genre.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
@CrossOrigin
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/{id}")
    public Iterable<Genre> read() {
        return genreService.getAllGenres();
    }

    @PostMapping("/{id}")
    public Genre save (@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @GetMapping(params = {"/nom"})
    public List<Genre> rechercheParGenre(@RequestParam String nomGenre){
        return genreService.findByGenre(nomGenre);
    }
}
