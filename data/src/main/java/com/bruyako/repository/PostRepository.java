package com.bruyako.repository;

import com.bruyako.entity.Post;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostRepository implements BaseRepository<Post, Long> {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void create(Post post) {
        getSession().save(post);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Post p where p.Post_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Post post) {
        getSession().saveOrUpdate(post);
    }

    @Override
    public Post getById(Long id) {
        Post post = (Post) getSession()
                .createQuery("select p.Post_id from Post p where p.Post_id = :id")
                .setParameter("id", id);
        return post;
    }

    @Override
    public List<Post> getAll() {
        List<Post> posts = getSession().createQuery("from Post").list();
        return posts;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
