package com.demos.arche7.project.service.Article;

import com.demos.arche7.project.model.Article;

import java.util.Optional;

public interface ArticleService {
    Iterable<Article> getAllArticles();

    Article saveArticle(Article article);


    void save(Article updateArticle);
}

