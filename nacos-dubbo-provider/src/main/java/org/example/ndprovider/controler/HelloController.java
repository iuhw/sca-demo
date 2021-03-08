package org.example.ndprovider.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/controller/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "[controller provider] " + name;
    }
}
