package com.haigeek.server.service;

import com.haigeek.api.service.RestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2020-04-11 12:45 上午
 */
@RestController
public class RestServiceImpl implements RestService {
    @Override
    public String hello(String para) {
        return "hello rest "+para;
    }
}
