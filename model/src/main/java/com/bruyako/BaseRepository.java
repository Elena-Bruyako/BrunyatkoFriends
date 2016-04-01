package com.bruyako;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by brunyatko on 31.03.16.
 */
public abstract class BaseRepository<T, P> {

    @Autowired
    public SessionFactory sessionFactory;

    public abstract void create(T t);
    public abstract void delete(P p);
    public abstract void update(T t);
    public abstract T getById(P p);
    public abstract List<T> getAll();
}
