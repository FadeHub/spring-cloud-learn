package com.sl.cloud.learn.controller;

import com.sl.cloud.learn.server.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuliangzhao
 * @Title: HelloController
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/11/24 16:03
 */
    @RestController
    public class HelloController {

        @Autowired
        private HelloService helloService;

        @GetMapping(value = "/hi")
        public String helloService(String name) {
            return helloService.helloService(name);
        }

    }
