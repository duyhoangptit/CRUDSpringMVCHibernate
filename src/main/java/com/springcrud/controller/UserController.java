package com.springcrud.controller;

import com.springcrud.dao.UserService;
import com.springcrud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "homepage", method = RequestMethod.GET)
    public String index(ModelMap map) {
        List<User> users = userService.findAll();
        map.put("users", users);
        return "userPage";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(ModelMap map) {
        map.put("user", new User());
        return "userNew";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insertUser(@ModelAttribute(value = "user") User user
            , ModelMap map) {
        userService.insert(user);
        return "redirect:userPage";
    }

    @RequestMapping(value = "delete/{username}", method = RequestMethod.GET)
    public String insertUser(@PathVariable(value = "username") String username
            , ModelMap map) {
        User user = userService.getUser(username);
        userService.delete(user);
        return "redirect:userPage";
    }

    @RequestMapping(value = "eidt/{username}", method = RequestMethod.GET)
    public String editUser(@PathVariable(value = "username") String username
            , ModelMap map) {
        User user = userService.getUser(username);
        map.put("user", user);
        return "userEdit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute(value = "user") User user
            , ModelMap map) {
        userService.update(user);
        return "redirect:userPage";
    }
}
