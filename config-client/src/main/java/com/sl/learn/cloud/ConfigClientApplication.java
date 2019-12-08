package com.sl.learn.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuliangzhao
 * @Title: ConfigClientApplication
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/8 16:58
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${helloConfig}")
    private String helloConfig;

    @RequestMapping(value = "/hi")
    public String helloConfig() {
        return helloConfig;
    }
}
