package com.bruyako.repository;

import com.bruyako.entity.Place;
import com.bruyako.BaseRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PlaceRepository extends BaseRepository <Place, Long> {

    @Override
    public void create(Place place) {
        getSession().save(place);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Place p where p.Place_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Place place) {
        getSession().saveOrUpdate(place);
    }

    @Override
    public Place getById(Long id) {
        Place place = (Place) getSession()
                .createQuery("select p.Place_id from Place p where p.Place_id = :id")
                .setParameter("id", id);
        return place;
    }

    @Override
    public List<Place> getAll() {
        List<Place> places = getSession().createQuery("from Place").list();
        return places;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
