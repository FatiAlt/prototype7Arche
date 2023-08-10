package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.repository.ArticleRepository;
import com.demos.arche7.project.service.Article.ArticleService;
import com.demos.arche7.project.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleRepository articleRepository;


    //construction de la méthode read avec le verb Get pour recupérer les articles
    @GetMapping
    public Iterable<Article> readAll() {
        return articleService.getAllArticles();
    }
    @GetMapping("/{id}")
    public Optional<Article> readById(Long id) {
        return articleService.findById(id);
    }

    //construction de la méthode create avec  le verb Post pour ajouter les articles
    @PostMapping
    public Article save (@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    //construction de la méthode Delete avec le verb Delete pour supprimer les articles
    @DeleteMapping("/{id}")
    public Article article (@PathVariable Long id) {
        return article(id);
    }

    //construction de la méthode Update avec le verb Put pour mettre à jour les articles avec la method responseEntity
    @PutMapping("/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable long id, @RequestBody Article article) {
        Article updateArticle = articleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Article not exist with id:" + id));

        updateArticle.setDesignation(article.getDesignation());
        updateArticle.setRef(article.getRef());
        updateArticle.setFormat(article.getFormat());
        updateArticle.setResume(article.getResume());
        updateArticle.setPrixHt(article.getPrixHt());
        updateArticle.setGenre(article.getGenre());

        articleRepository.save(updateArticle);

        return ResponseEntity.ok(updateArticle);
    }
    // recherche en fonction de la référence (avec un paramètre de type ?ref=)
    @GetMapping(params = {"ref"})
    public Article findByRef (@RequestParam String ref){
        return articleService.rechercheRef(ref);
    }

    //recherche en fonction de la désignation(params type)
    @GetMapping(params = {"designation"})
    public List<Article> findByDesignation(@RequestParam String designation){
        return articleService.findByDesignation(designation);
    }

}
