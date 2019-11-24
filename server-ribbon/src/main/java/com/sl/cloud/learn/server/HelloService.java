package com.sl.cloud.learn.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: HelloServer
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/11/24 16:00
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://EUREKA-HELLO/hi?name="+name,String.class);
    }
}
