package com.glj.mall.member.feign;

import com.glj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date 2020/5/10 17:22
 **/
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
