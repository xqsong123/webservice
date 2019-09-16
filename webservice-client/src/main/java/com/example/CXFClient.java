package com.example;

import com.example.service.HelloService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;

import javax.xml.namespace.QName;

public class CXFClient {
    public static void main(String[] args) {
        ClientProxyFactoryBean factoryBean = new ClientProxyFactoryBean();
        factoryBean.setServiceClass(HelloService.class);
        factoryBean.setAddress("http://localhost:3333/hello?wsdl");
        HelloService helloService = (HelloService)factoryBean.create();
        System.out.println(helloService.greet("world"));

    }
}
