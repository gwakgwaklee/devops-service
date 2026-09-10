package com.example.devopsservice;

@RestController
public class AppController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}