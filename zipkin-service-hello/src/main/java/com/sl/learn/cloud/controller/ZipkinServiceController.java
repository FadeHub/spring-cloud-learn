package com.sl.learn.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: ZipkinServiceController
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/21 16:40
 */
@RestController
public class ZipkinServiceController {

    private static final Logger logger = LoggerFactory.getLogger(ZipkinServiceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        logger.info( "calling trace zipkin-service-hi  ");
        return restTemplate.getForObject("http://localhost:8980/zipkinHello", String.class);
    }

    @RequestMapping("/zipkinHello")
    public String hello1() {

        return "zipkin-hello";
    }
}
