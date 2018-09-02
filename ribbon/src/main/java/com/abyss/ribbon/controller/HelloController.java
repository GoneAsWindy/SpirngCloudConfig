package com.abyss.ribbon.controller;

import com.abyss.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abyss
 * @date 2018/9/1
 **/
@RestController
@RequestMapping("/ribbon")
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/hello")
  public String hello(String name){
    return helloService.hello(name);
  }
}
