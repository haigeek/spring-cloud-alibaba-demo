package com.haigeek.consumer.controller;

import com.haigeek.api.service.DubboRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2020-04-09 11:48 下午
 */
@RestController
public class HelloDubboRestController {


    @Autowired
    @Lazy
    private DubboRestService dubboRestService;

    @GetMapping("/dubbo/rest/hello")
    public String hello(@RequestParam String para){
        System.out.println(dubboRestService.hello(para));
        return dubboRestService.hello(para);
    }
}
