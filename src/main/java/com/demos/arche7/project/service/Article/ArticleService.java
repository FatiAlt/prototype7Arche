package com.demos.arche7.project.service.Article;

import com.demos.arche7.project.model.Article;

import java.util.List;
import java.util.Optional;

/**
 * Il s’agit de l’ensemble des classes qui permettent de réaliser les fonctionnalités de l’application.
 */

public interface ArticleService {

    Iterable<Article> getAllArticles();

    Article saveArticle(Article article);

// Article updateArticle(Article updateArticle);

    Article rechercheRef(String ref);

    List<Article> findByDesignation(String designation);

    Optional<Article> findById(Long id);

    void delete(Long id);
}

