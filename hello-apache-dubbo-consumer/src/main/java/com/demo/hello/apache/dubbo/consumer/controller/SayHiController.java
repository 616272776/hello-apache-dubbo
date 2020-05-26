package com.demo.hello.apache.dubbo.consumer.controller;

import com.demo.hello.apache.dubbo.provider.api.SayHi;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Version;

@RestController
public class SayHiController {

    @Reference(version = "1.0.0")
    private SayHi sayHi;

    @GetMapping(value = "/say/{name}")
    public String sayHi(@PathVariable String name){
        return sayHi.sayHi(name);
    }
}
