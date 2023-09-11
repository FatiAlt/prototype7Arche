package com.demos.arche7.project.repository;

import com.demos.arche7.project.controller.ArticleController;
import com.demos.arche7.project.model.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


 //* @method utiliser mySQL avec la méthode CRUD (CREATE, READ, UPDATE, DELETE)
 //* CE SONT 4 OPERATIONS SUR DES DONNÉES POUR FAIRE DES REQUÊTES HTTP C POUR POST, R POUR GET, U POUR PUT, D POUR DELETE

public interface ArticleRepository extends CrudRepository <Article,Long>{


    Article findByRef(String ref);

    List<Article> findArticlesByDesignationContains
            (String designation);

//    Optional<Article> findById(Long id);
//
//    Article updateArticle (Article updateArticle);
}





