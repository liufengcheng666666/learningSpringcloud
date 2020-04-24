package com.michael.springcloud.user.service.serviceImpl;

import com.michael.springcloud.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/23 10:24
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        String result =  restTemplate.getForObject("http://ORDER-SERVER/ribbon",String.class);
        LOGGER.info("返回ribbon:"+result);
        return result;
    }

}
