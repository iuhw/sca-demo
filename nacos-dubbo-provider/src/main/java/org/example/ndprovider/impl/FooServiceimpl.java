package org.example.ndprovider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.serviceapi.FooService;

@DubboService
public class FooServiceimpl implements FooService {
    @Override
    public String sayHello(String name) {
        return "[dubbo provider] " + name;
    }

    @Override
    public long getCurrentTime(boolean slow) {
        // Simulate slow invocations randomly.
        if (slow) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
        return System.currentTimeMillis();
    }
}
