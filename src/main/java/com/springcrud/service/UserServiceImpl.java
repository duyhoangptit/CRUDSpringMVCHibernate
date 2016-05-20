package com.springcrud.service;

import com.springcrud.dao.UserDAO;
import com.springcrud.dao.UserService;
import com.springcrud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * author Hoangptit
 * Date 5/20/2016
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User insert(User user) {
        userDAO.insert(user);
        return user;
    }

    @Override
    public User update(User user) {
        userDAO.update(user);
        return user;
    }

    @Override
    public boolean delete(User user) {
        try {
            userDAO.delete(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDAO.findAll();
        return users;
    }
}
