package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @GetMapping(value = "/add")
    public Integer add() {
        return computeClient.add(1, 11);
    }
}
