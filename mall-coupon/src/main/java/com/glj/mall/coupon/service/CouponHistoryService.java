package com.glj.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.glj.common.utils.PageUtils;
import com.glj.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:25:57
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

