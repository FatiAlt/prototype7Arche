package com.demos.arche7.project.service.Genre;

import com.demos.arche7.project.model.Genre;
import com.demos.arche7.project.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GenreServiceImpl implements GenreService{
    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Iterable<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public List<Genre> findByGenre(String nomGenre) {
        return genreRepository.findByGenre(nomGenre);
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public Optional<Genre> getFindById(Long id) {
        return Optional.empty();
    }


}
