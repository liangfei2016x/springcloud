package com.example.computeservice.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;
    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a+b;
        logger.info("/add,host:"+instance.getHost()+",service_id:"+instance.getServiceId()+",result="+r);
        return r;
    }
}
