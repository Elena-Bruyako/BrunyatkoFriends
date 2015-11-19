package com.bruyako;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface AbstractDao<T, P> {

    void add(T t);
    void delete(T t);
    T getById(P p);
}

