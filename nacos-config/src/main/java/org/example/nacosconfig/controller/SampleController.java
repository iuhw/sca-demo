package org.example.nacosconfig.controller;

import org.example.nacosconfig.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private User user;

    @GetMapping("/config/get")
    public String getConfig() {
        return "[HTTP] +" + user;
    }
}
