package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    public Iterable<Genre> findAll();

    public List<Genre> save(String nomGenre);

    public Genre findByGenre(Genre genre);
}
