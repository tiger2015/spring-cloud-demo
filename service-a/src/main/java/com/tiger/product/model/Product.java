package com.tiger.product.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Zenghu
 * @Date 2024年03月28日 21:57
 * @Description
 * @Version: 1.0
 **/
@Data
@TableName(value = "sale.product")
public class Product implements Serializable {
    private static final long serialVersionUID = 7327309630392065588L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Double stock;

    private String unit;

    private Double price;

    private Date createTime;

    private Integer creatorId;

    private Date updateTime;

    private Integer updaterId;
}
