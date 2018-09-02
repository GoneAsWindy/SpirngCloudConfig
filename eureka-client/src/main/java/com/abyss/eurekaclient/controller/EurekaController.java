package com.abyss.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abyss
 * @since 2018/8/29
 **/
@RestController
public class EurekaController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello, " + name + ", I'm from port: " + port;
    }
}
