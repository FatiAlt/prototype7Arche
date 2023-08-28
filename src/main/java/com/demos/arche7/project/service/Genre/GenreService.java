package com.demos.arche7.project.service.Genre;

import com.demos.arche7.project.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    Iterable<Genre> getAllGenres();

    //List<Genre> findByGenre(String nomGenre);

    Genre saveGenre(Genre genre);

    Optional<Genre> getFindById(Long id);

    List<Genre> findByGenre(String nomGenre);
}
