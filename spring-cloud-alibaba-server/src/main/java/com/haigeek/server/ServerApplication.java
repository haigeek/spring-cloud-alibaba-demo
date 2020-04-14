package com.haigeek.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaohj
 * @date 2020-04-11 1:00 上午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ServerApplication.class);
    }
}
