package com.demos.arche7.project.service;

import com.demos.arche7.project.model.Article;

public interface ArticleService {
    Iterable<Article> getAllArticles();

    Article saveArticle(Article article);

}
