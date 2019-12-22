package com.sl.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shuliangzhao
 * @Title: ZipkinServiceHiApplication
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/21 16:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZipkinServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceHiApplication.class,args);
    }
}
