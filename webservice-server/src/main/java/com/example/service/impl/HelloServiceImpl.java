package com.example.service.impl;

import com.example.service.HelloService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.service.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String greet(String name) {
        return "hello, " + name;
    }
}
