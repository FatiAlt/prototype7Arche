package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.service.Article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author fatima
 * @since V2
 * @version 1.0
 */
@RestController
@RequestMapping("/articles")
@CrossOrigin
/**
 * construction de la méthode read avec le verb Get pour recupérer les articles
 * @param readAll qui affiche tous les articles
 * @return une liste d'articles
 * @param readById qui affiche les articles via leur clé
 * @return une liste avec l'id
 * @param findByRef qui recherche les articles avec leur référence
 * @param findByDesignation qui recherche les articles avec une désignation ou un mot clé
 * @param save ajoute un article
 */
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public Iterable<Article> readAll() {
        return articleService.getAllArticles();
    }
    @GetMapping("/{id}")
    public Optional<Article> readById(Long id) {
        return articleService.findById(id);
    }

    /**construction de la méthode create avec  le verb Post pour ajouter les articles*/
    @PostMapping("/save")
    public Article save (@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    /**construction de la méthode Delete avec le verb Delete pour supprimer les articles*/
    @DeleteMapping("/{id}")
    public Article article (@PathVariable Long id) {
        return article(id);
    }

    /**construction de la méthode Update avec le verb Put pour mettre à jour les articles avec la method responseEntity*/

/*    @PutMapping("/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable long id, @RequestBody Article article) {
        Article updateArticle = articleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Article not exist with id:" + id));

        updateArticle.setDesignation(article.getDesignation());
        updateArticle.setRef(article.getRef());
        updateArticle.setFormat(article.getFormat());
        updateArticle.setResume(article.getResume());
        updateArticle.setPrixHt(article.getPrixHt());
        updateArticle.setTva(article.getTva());

        articleRepository.save(updateArticle);

        return ResponseEntity.ok(updateArticle);
    }*/

    /**recherche en fonction de la référence (avec un paramètre de type ?ref=)*/
    @GetMapping(params = {"ref"})
    public Article findByRef (@RequestParam String ref){
        return articleService.rechercheRef(ref);
    }

    /**recherche en fonction de la désignation(params type)*/
    @GetMapping(params = {"designation"})
    public List<Article> findByDesignation(@RequestParam String designation){
        return articleService.findByDesignation(designation);
    }


    }

