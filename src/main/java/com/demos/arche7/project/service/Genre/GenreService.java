package com.demos.arche7.project.service.Genre;

import com.demos.arche7.project.model.Genre;

import java.util.List;

public interface GenreService {
    Iterable<Genre> getAllGenres();

    //List<Genre> findByGenre(String nomGenre);

    Genre saveGenre(Genre genre);
}
