package com.bruyako.dao;

import java.util.List;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface AbstractDao<T, P> {

    void create(T t);
    void delete(T t);
    void update(T t);
    List<T> getAll();
    T getById(P p);
}

