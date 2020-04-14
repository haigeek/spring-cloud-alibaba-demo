package com.haigeek.provider.service;

import com.haigeek.api.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhaohj
 * @date 2020-04-09 10:26 下午
 */
@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String hello(String para) {
        return "hello"+para;
    }
}
