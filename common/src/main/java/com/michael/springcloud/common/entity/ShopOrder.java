package com.michael.springcloud.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(ShopOrder)实体类
 *
 * @author makejava
 * @since 2020-04-22 14:50:12
 */
@Data
public class ShopOrder implements Serializable {
    private static final long serialVersionUID = 833961259313112965L;
    /**
    * 订单id
    */
    private Long orderid;
    /**
    * 下单人id
    */
    private Integer userid;
    /**
    * 订单总价
    */
    private Double amount;
    /**
    * 订单状态
    */
    private Integer status;
    /**
    * 收货地址
    */
    private Integer addressid;
    /**
    * 快递id
    */
    private Long expressid;
    /**
    * 快递单号
    */
    private String expressno;
    /**
    * 支付交易号
    */
    private String tradeno;
    /**
    * 支付信息
    */
    private String tradeext;
    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;
    /**
    * 更新时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updatetime;



}