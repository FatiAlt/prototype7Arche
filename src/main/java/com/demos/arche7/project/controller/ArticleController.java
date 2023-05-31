package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Autowired
    private final ArticleService articleService;

    @GetMapping("/read")
    public Iterable<Article> read() {
        return articleService.getAllArticles();

    }

    @PostMapping("/save")
    public Article save (@RequestBody Article article) {

        return articleService.saveArticle(article);
    }
    @DeleteMapping("/article/{id}")
    public Article article (@PathVariable Long id) {
        return article(id);
    }

}
