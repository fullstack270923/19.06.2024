package com.example.demo.controllers;

//const Router = require('router')
//new Router()

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "<h1 style='color:green'>Hello from Spring controller</h1>";
    }

}
