package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.ArticleRepository;
import com.demos.arche7.project.service.Article.ArticleService;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    @Autowired
    private final ArticleService articleService;
    private final ArticleRepository articleRepository;

    public ArticleController(ArticleService articleService, ArticleRepository articleRepository) {
        this.articleService = articleService;

        this.articleRepository = articleRepository;
    }

    //construction de la méthode read avec le verb Get pour recupérer les articles
    @GetMapping("/read")
    public Iterable<Article> read() {
        return articleService.getAllArticles();

    }

    //construction de la méthode create avec  le verb Post pour ajouter les articles
    @PostMapping("/save")
    public Article save (@RequestBody Article article) {

        return articleService.saveArticle(article);
    }

    //construction de la méthode Delete avec le verb Delete pour supprimer les articles
    @DeleteMapping("/article/{id}")
    public Article article (@PathVariable Long id) {
        return article(id);
    }

    //construction de la méthode Update avec le verb Put pour mettre à jour les articles
    @PutMapping("article/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable long id, @RequestBody Article article) {
        Article updateArticle = articleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Article not exist with id:" + id));

        updateArticle.setDesignation(article.getDesignation());
        updateArticle.setRef(article.getRef());
        updateArticle.setFormat(article.getFormat());
        updateArticle.setResume(article.getResume());
        updateArticle.setPrixHt(article.getPrixHt());
        updateArticle.setType(article.getType());

        articleRepository.save(updateArticle);

        return ResponseEntity.ok(updateArticle);
    }
}
