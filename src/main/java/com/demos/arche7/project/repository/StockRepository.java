package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Stock;

public interface StockRepository {
    Object findByArticleId(String articleId);

    void save(Stock stock);

}
