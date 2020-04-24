package com.michael.springcloud.order.controller;

import com.michael.springcloud.common.entity.ShopOrder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author: Michael
 * @Description:
 * @Date: Create in 2020/4/22 16:39
 */
@RestController
public class OrderController {

    @RequestMapping(value = "/userOrders",method = RequestMethod.GET)
    public String getUserOrder(){
        ShopOrder shopOrder = new ShopOrder();
        shopOrder.setOrderid(10001L);
        shopOrder.setUserid(001);
        shopOrder.setAddressid(10001);
        shopOrder.setAmount(99.99);
        shopOrder.setExpressid(999L);
        shopOrder.setCreatetime(new Date());
        return shopOrder.toString();
    }

    @GetMapping("/ribbon")
    public String testRibbon(){
        return "hello ribbon !!";
    }


}
