package com.haigeek.api.service;


import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaohj
 * @date 2020-04-10 9:38 上午
 */
@FeignClient("provider")
@DubboTransported(protocol = "dubbo")
public interface DubboRestService {
    @GetMapping("/param")
    String hello(@RequestParam String para);
}
