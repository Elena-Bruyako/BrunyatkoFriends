package com.bruyako.repository;

import java.util.List;

/**
 * Created by brunyatko on 31.03.16.
 */
public interface BaseRepository<T, P> {

    void create(T t);
    void delete(P p);
    void update(T t);
    T getById(P p);
    List<T> getAll();
}
