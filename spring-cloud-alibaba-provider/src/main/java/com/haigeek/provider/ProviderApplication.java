package com.haigeek.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaohj
 * @date 2020-04-09 11:54 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
    public static void main(String [] args){
        SpringApplication.run(ProviderApplication.class);
    }
}
