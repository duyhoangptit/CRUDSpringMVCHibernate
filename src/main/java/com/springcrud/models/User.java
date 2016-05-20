package com.springcrud.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * author Hoangptit
 * Date 5/20/2016
 */
@Entity
@Table
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40, nullable = false)
    private String username;
    @Column(length = 40, nullable = false)
    private String password;
    @Column(length = 50, nullable = false)
    private String fullName;
    @Column(length = 50, nullable = false)
    private String email;

    public User() {
    }

    public User(String username, String password, String fullName, String email) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
