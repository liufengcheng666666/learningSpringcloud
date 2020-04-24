package com.michael.springcloud.user.service.serviceImpl;

import com.michael.springcloud.user.service.FeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/24 14:30
 */
@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry feign ----";
    }
}
