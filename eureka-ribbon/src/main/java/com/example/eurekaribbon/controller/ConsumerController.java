package com.example.eurekaribbon.controller;

import com.example.eurekaribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @GetMapping(value = "/add")
    public String add() {
        return computeService.add();
    }
}
