package com.example.demo.client;


import com.example.demo.model.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value ="USER-SERVICE")

public interface UserClient {

    @GetMapping("")
    List<User> getAllUsers();

}
