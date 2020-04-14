package com.haigeek.boot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haigeek.api.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2020-04-09 11:45 下午
 */
@RestController
public class HelloDubboController {

    @Reference
    private EchoService echoService;


    @GetMapping("/dubbo/hello")
    public String hello(@RequestParam String para) {

        return echoService.hello(para);
    }
}
