package com.glj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.glj.common.utils.PageUtils;
import com.glj.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 19:50:17
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

