package com.example.demo.controller;


import com.example.demo.client.UserClient;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObjectController {

    @Autowired
    private UserClient userClient;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userClient.getAllUsers();
    }

}
