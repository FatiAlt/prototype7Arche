package com.demos.arche7.project.repository;

import com.demos.arche7.project.controller.ArticleController;
import com.demos.arche7.project.model.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


 /** Utilisation du CRUD (CREATE, READ, UPDATE, DELETE)
 */

public interface ArticleRepository extends CrudRepository <Article,Long>{

     /**
      *
      * @param ref cherche l'article voulu par la référence
      * @return l'article avec la référence
      */
    Article findByRef(String ref);

     /**
      * @param designation recherche l'article par la désignation d'un mot clé
      * @return l'article voulu
      */
    List<Article> findArticlesByDesignationContains
            (String designation);

//    Optional<Article> findById(Long id);
//
//    Article updateArticle (Article updateArticle);

}





