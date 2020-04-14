package com.haigeek.consumer.controller;

import com.haigeek.api.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2020-04-11 12:47 上午
 */
@RestController
public class HelloRestController {

    @Autowired
    @Lazy
    private RestService restService;

    @GetMapping("/rest/hello")
    public String hello(@RequestParam String para){
        System.out.println(restService.hello(para));
        return restService.hello(para);
    }
}
