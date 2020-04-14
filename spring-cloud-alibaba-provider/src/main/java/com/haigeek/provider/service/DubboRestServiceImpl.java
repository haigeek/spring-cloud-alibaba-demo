package com.haigeek.provider.service;

import com.haigeek.api.service.DubboRestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2020-04-10 9:39 上午
 */

@Service
@RestController
public class DubboRestServiceImpl implements DubboRestService {
    @Override
    public String hello( String para) {
        return "hello dubbo rest"+para;
    }
}
