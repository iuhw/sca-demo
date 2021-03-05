package org.example.ndConsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.serviceapi.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FooServiceController {



    @DubboReference
    private FooService fooService;

    @GetMapping("/hello/{name}")
    public String sayHello(String name) {
        return fooService.sayHello(name);
    }

    @GetMapping("/getCurrentTime")
    public long getCurrentTime(boolean slow) {
        return fooService.getCurrentTime(slow);
    }

}
