package com.demos.arche7.project.service;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;


    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> getAllArticles() {
        return articleRepository.findAll();

    }

    @Override
    public Article saveArticle(Article article) {

        return articleRepository.save(article);
    }
}
