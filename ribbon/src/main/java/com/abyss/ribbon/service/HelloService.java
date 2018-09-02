package com.abyss.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author abyss
 * @since 2018/9/1
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name){
        return restTemplate.getForObject("http://service-hi/hello/" + name, String.class);
    }

    public String helloError(String name){
    return "hello, " + name + " , sorry, service error!";
    }
}
