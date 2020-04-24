package com.michael.springcloud.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单详情表(ShopOrderDetail)实体类
 *
 * @author makejava
 * @since 2020-04-22 14:52:53
 */
@Data
public class ShopOrderDetail implements Serializable {
    private static final long serialVersionUID = -22043429307155974L;
    /**
    * 订单详情id
    */
    private Long detailid;
    /**
    * 订单id
    */
    private Long orderid;
    /**
    * 商品id
    */
    private Long productid;
    /**
    * 商品价格
    */
    private Double price;
    /**
    * 商品数量
    */
    private Integer productnum;
    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;


}