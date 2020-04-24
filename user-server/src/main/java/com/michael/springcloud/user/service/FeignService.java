package com.michael.springcloud.user.service;

import com.michael.springcloud.user.service.serviceImpl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/23 10:51
 */
@FeignClient(value = "order-server",fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/ribbon",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
