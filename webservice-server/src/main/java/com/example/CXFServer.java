package com.example;

import com.example.service.HelloService;
import com.example.service.impl.HelloServiceImpl;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CXFServer {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        ServerFactoryBean factoryBean = new ServerFactoryBean();
        factoryBean.setServiceClass(HelloService.class);
        factoryBean.setServiceBean(helloService);
        factoryBean.setAddress("http://localhost:3333/hello");
        factoryBean.create();
        System.out.println("CXF 服务端已启动 . . .");
    }
}
