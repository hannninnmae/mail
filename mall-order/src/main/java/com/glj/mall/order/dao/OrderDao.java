package com.glj.mall.order.dao;

import com.glj.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:44:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
