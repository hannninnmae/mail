package com.glj.mall.coupon.dao;

import com.glj.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:25:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
