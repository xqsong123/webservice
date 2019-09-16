package com.example;


import com.example.service.impl.HelloService;
import com.example.service.impl.HelloServiceImplService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 * 通过jdk自带的命令生成代理类，保留.java文件
 * wsimport -s . http://localhost:3333/webservice/hello?wsdl
 *
 *
 * 博文https://blog.csdn.net/cs_hnu_scw/article/details/80181762
 *
 */
public class ClientBootstrap
{
    public static void main( String[] args )
    {
//        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
//        HelloService helloService = helloServiceImplService.getHelloServiceImplPort();
//        System.out.println(helloService.greet("world"));

        //QName调用
        try {
            URL url = new URL("http://localhost:3333/webservice/hello?wsdl");
            QName qName = new QName("http://impl.service.example.com/", "HelloServiceImplService");
            Service service = Service.create(url, qName);
            HelloService helloService = service.getPort(HelloService.class);
            System.out.println(helloService.greet("world"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
