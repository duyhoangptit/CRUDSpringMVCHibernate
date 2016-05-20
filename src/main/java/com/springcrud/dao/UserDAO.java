package com.springcrud.dao;

import com.springcrud.models.User;

import java.util.List;

/**
 * author Hoangptit
 * Date 5/20/2016
 */
public interface UserDAO {
    User insert(User user);
    User update(User user);
    boolean delete(User user);
    User getUser(String username);
    List<User> findAll();
}
