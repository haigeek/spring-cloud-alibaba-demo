package com.haigeek.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaohj
 * @date 2020-04-11 12:44 上午
 */
@FeignClient("server")
public interface RestService {
    @GetMapping("/param")
    String hello(@RequestParam String para);
}
