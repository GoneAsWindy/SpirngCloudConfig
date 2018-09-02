package com.abyss.feign.service;

import com.abyss.feign.service.impl.HiServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author abyss
 * @date 2018/9/1
 **/
@FeignClient(value = "service-hi", fallback = HiServiceHystrix.class)
public interface HiService {

  @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
  String sayFeignHi(@PathVariable(name = "name")String name);
}
