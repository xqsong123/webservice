package com.example.service;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String greet(String name);
}
