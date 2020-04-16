package com.michael.springcloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/16 14:42
 */
@RequestMapping("/config")
@RestController
@RefreshScope
public class ConfigController {
        @Value("${username}")
        private String username;

        @RequestMapping(value = "/getUserConfig",method = RequestMethod.GET)
        public String getUserConfig(){
            return username;
        }
}
