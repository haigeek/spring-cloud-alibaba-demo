package com.haigeek.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhaohj
 * @date 2020-04-09 11:56 下午
 */
@SpringBootApplication(scanBasePackages = "com.haigeek")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.haigeek.api.service")
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class);
    }
}
