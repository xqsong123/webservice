package com.example.service;

import javax.jws.WebService;

/**
 * 必须加@WebService注解或者@WebServiceProvider
 * 至少有一个方法是public，并且不可以用static 和 final进行修饰
 */
@WebService
public interface HelloService {
    String greet(String name);
}
