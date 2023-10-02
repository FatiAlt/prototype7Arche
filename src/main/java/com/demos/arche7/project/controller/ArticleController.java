package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author fatima
 * @since V1
 * @version 1.0
 */
@RestController
@RequestMapping("/articles")
@CrossOrigin
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * findAll  affiche tous les articles
     * @return une liste d'articles
     */
    @GetMapping
    public Iterable<Article> findAll() {
        return articleService.getAllArticles();
    }

    /**
     *
     * @param id   affiche les articles via l'id
     * @return l'id de l'article souhaité
     */
    @GetMapping("/{id}")
    public Optional<Article> findById(Long id) {
        return articleService.findById(id);
    }

    /**
     * @param article ajoute un article
     * @return  l'article sauvegardé
     */
    @PostMapping("/save")
    public Article save (@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    /**
     * @param id supprime l'article via son id
     * @return l'article supprimé
     */
 /*   @DeleteMapping("/{id}")
    public Article delete (@PathVariable Long id) {
        return delete(id);
    }*/

    /**
     *
     * @param ref recherche les articles avec leur référence
     * @return les références des articles souhaités
     */
    //recherche en fonction de la référence
    @GetMapping(params = {"ref"})
    public Article findByRef (@RequestParam String ref){
        return articleService.rechercheRef(ref);
    }

    /**
     * @param keyword recherche les articles avec une désignation ou un mot clé
     * @return l'article souhaité
     */
    @GetMapping("/search/designation")
    public List<Article> findByDesignation(@RequestParam String keyword){
        return articleService.findByDesignation(keyword);
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


}

