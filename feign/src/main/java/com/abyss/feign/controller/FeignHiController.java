package com.abyss.feign.controller;

import com.abyss.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abyss
 * @date 2018/9/1
 **/
@RestController
@RequestMapping("/feign")
public class FeignHiController {

  @Autowired
  private HiService hiService;

  @GetMapping("/hi")
  public String sayHi(String name){
    return hiService.sayFeignHi(name);
  }
}
