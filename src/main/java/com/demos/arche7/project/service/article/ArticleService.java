package com.demos.arche7.project.service.article;

import com.demos.arche7.project.model.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    Iterable<Article> getAllArticles();

    Article saveArticle(Article article);

// Article updateArticle(Article updateArticle);

    Article rechercheRef(String ref);

    List<Article> findByDesignation(String keyword);

    Optional<Article> findById(Long id);

    /**
     *
     * @param id supprime l'article via son id
     * @return l'article supprimé
     */
//    void delete(Long id);
}

