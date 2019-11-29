package com.sl.cloud.learn.controller;

import com.sl.cloud.learn.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuliangzhao
 * @Title: FeignController
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/11/29 21:11
 *
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String feign(@RequestParam(value = "name") String name) {
        return feignService.sayHiFromClientOne(name);
    }
}
