package com.example;

import com.example.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class ServerBootstrap
{
    public static void main( String[] args )
    {
        String wsUrl = "http://localhost:3333/webservice/hello";
        Endpoint.publish(wsUrl, new HelloServiceImpl());
        System.out.println("服务端已启动 . . .");
    }
}
