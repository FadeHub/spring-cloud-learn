package com.sl.learn.cloud.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: RestTemplate
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/21 16:36
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate  getRestTemplate() {
         return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
