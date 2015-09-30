package com.bruyako.dao;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface AbstractDao<T, P> {

    void add(T t);
    void edit(T t);
    T get(P p);
    void remove(T t);
    T update(T t);
}
