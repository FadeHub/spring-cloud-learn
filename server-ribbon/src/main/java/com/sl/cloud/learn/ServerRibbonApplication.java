package com.sl.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: ServerRibbonApplication
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/11/24 15:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerRibbonApplication {


    public static void main(String[] args) {
        SpringApplication.run( ServerRibbonApplication.class, args );
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
