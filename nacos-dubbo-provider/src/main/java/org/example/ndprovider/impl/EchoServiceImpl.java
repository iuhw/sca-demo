package org.example.ndprovider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.serviceapi.EchoService;

@DubboService
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "[ECHO] " + message;
    }
}
