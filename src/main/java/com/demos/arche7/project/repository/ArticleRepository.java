package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Article;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository <Article,Long>{

}
