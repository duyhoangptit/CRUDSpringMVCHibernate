package com.springcrud.impl;

import com.springcrud.dao.UserDAO;
import com.springcrud.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * author Hoangptit
 * Date 5/20/2016
 */
@Repository
public class UserDAOImpl implements UserDAO {
    private Session session;

    @Autowired
    private SessionFactory sessionFactory;

    private void openSession() {
        this.session = this.sessionFactory.getCurrentSession();
    }

    @Override
    public User insert(User user) {
        openSession();
        session.persist(user);
        return user;
    }

    @Override
    public User update(User user) {
        openSession();
        session.merge(user);
        return user;
    }

    @Override
    public boolean delete(User user) {
        session.delete(user);
        return false;
    }

    @Override
    public User getUser(String username) {
        openSession();
        User user = (User)session.createCriteria(User.class).add(Restrictions.eq("username",username)).uniqueResult();
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAll() {
        openSession();
        List<User> users = session.createQuery("from User").list();
        return users;
    }
}
