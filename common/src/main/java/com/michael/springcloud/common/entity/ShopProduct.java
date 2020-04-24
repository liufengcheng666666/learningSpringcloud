package com.michael.springcloud.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表(ShopProduct)实体类
 *
 * @author makejava
 * @since 2020-04-22 14:51:58
 */
@Data
public class ShopProduct implements Serializable {
    private static final long serialVersionUID = -37758215535336779L;
    /**
    * 商品id
    */
    private Long productid;
    /**
    * 商品分类id
    */
    private Long cateid;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品描述
    */
    private String description;
    /**
    * 库存
    */
    private Long num;
    /**
    * 价格
    */
    private Double price;
    /**
    * 封面图
    */
    private String cover;
    /**
    * 图片集合
    */
    private String pics;
    /**
    * 是否促销：0-否，1-促销
    */
    private Integer issale;
    /**
    * 促销价格
    */
    private Double saleprice;
    /**
    * 是否热卖：0-热卖，1-非热卖
    */
    private Integer ishot;
    /**
    * 是否上架：0-上架，1-下架
    */
    private Integer ison;
    /**
    * 是否推荐：0-否，1-推荐
    */
    private Integer istui;
    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;


}