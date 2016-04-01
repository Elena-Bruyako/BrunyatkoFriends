package com.bruyako.repository;

import com.bruyako.entity.Hobby;
import com.bruyako.BaseRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.*;
/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class HobbyRepository extends BaseRepository <Hobby, Long> {

    @Override
    public void create(Hobby hobby) {
        getSession().save(hobby);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Hobby h where h.Hobby_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Hobby hobby) {
        getSession().saveOrUpdate(hobby);
    }

    @Override
    public Hobby getById(Long id) {

        Hobby hobby = (Hobby) getSession()
                .createQuery("select h.Hobby_id from Hobby h where h.Hobby_id = :id")
                .setParameter("id", id);
        return hobby;
    }

    @Override
    public List<Hobby> getAll() {
        List<Hobby> hobbies = getSession().createQuery("from Hobby").list();
        return hobbies;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
