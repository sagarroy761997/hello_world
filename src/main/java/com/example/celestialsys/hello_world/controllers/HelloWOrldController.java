package com.example.celestialsys.hello_world.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrldController {
    
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }
}
