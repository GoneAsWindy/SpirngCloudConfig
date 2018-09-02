package com.abyss.feign.service.impl;

import com.abyss.feign.service.HiService;
import org.springframework.stereotype.Component;

/**
 * @author abyss
 * @date 2018/9/1
 **/
@Component
public class HiServiceHystrix implements HiService {

  @Override
  public String sayFeignHi(String name) {
    return "sorry, " + name + ", service error!";
  }
}
