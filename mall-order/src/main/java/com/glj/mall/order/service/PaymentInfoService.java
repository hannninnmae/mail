package com.glj.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.glj.common.utils.PageUtils;
import com.glj.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:44:46
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

