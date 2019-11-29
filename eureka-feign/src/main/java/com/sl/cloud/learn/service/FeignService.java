package com.sl.cloud.learn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shuliangzhao
 * @Title: FeignService
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/11/29 21:10
 */
@FeignClient("eureka-hello")
public interface FeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
