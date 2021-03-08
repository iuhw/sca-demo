package org.example.ndConsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.serviceapi.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EchoServiceController {

    @Autowired
    public RestTemplate restTemplate;

    @DubboReference
    private EchoService echoService;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message) {
        return echoService.echo(message);
    }

    @GetMapping("/call/echo/{message}")
    public String callEcho(@PathVariable("message") String message) {
        return restTemplate.getForObject("http://nacos-dubbo-provider/controller/hello/" + message, String.class);
    }
}
