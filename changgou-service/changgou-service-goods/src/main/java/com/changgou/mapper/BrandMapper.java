package com.changgou.mapper;


import com.changgou.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;


/**
 * Dao层:
 *  *  使用通用Mapper->MyBatis动态SQL
 *  *  0SQL语句,面向对象操作
 *  *  要求：Dao必须集成Mapper<T>接口
 *  *        Mapper接口中有增删改查各种操作
 * @version v1
 * @author liuyangxing
 * @since 2020/2/21
 * @summary
 **/
public interface BrandMapper extends Mapper<Brand> {

}
