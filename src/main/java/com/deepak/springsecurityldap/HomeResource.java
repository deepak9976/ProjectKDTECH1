package com.deepak.springsecurityldap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {


    @GetMapping("/")
    public String  HelloWorld(){

        return "Home Page";
    }
}
