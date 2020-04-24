package com.michael.springcloud.user.controller;

import com.michael.springcloud.common.resultVO.AjaxResult;
import com.michael.springcloud.user.service.FeignService;
import com.michael.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/21 15:28
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Autowired
    FeignService feignService;

    /** 
    * @Description: 用户订单接口
    * @Param:   
    * @Author: Michael
     * @Date: 2020/4/22 
    */

    @GetMapping("/order")
    public AjaxResult userOrder(@RequestParam String name){
        String result =  userService.hiService(name);
        System.out.println(result);
        return AjaxResult.success(result);
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignService.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testApi(){
        return "hello world";
    }
}
