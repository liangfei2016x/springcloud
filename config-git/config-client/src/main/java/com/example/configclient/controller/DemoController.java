package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${from}")
    private String from;

    @GetMapping(value = "/hello")
    public String from() {
        return this.from;
    }

}
