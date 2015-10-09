package com.bruyako.dao;

import java.util.List;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface AbstractDao<T> {

    void create(T t);
    void delete(Long id);
    void update(T t);
    List<T> getAll();
}

