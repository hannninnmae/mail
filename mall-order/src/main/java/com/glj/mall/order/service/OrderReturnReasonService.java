package com.glj.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.glj.common.utils.PageUtils;
import com.glj.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:44:46
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

