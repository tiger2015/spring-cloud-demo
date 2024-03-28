package com.tiger.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tiger.product.model.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Zenghu
 * @Date 2024年03月28日 22:00
 * @Description
 * @Version: 1.0
 **/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
