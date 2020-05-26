package com.demo.hello.apache.dubbo.provider.service;

import com.demo.hello.apache.dubbo.provider.api.SayHi;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class SayHiImpl implements SayHi {
    public String sayHi(String string) {
        return "服务提供了:"+string;
    }
}
