package com.abyss.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abyss
 * @date 2018/9/2
 **/
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${foo}")
    private String foo;

    @Value("${demo-config-client}")
    private String configClient;

    @GetMapping("/hi")
    public String hi(){
        return foo + "," + configClient;
    }
}
