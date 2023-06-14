package com.demos.arche7.project.service.Article;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


    @Override
    public Iterable<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }
    @Override
    public Article updateArticle(Article updateArticle) {
        return articleRepository.save(updateArticle);
    }
    @Override
    public Article rechercheRef(String ref) {
        return articleRepository.findByRef(ref);
    }
    @Override
    public List<Article> findByDesignation(String designation) {
        return articleRepository.findArticlesByDesignationContains(designation);
    }

    @Override
    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }
}
