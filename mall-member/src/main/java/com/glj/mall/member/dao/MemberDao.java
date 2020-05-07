package com.glj.mall.member.dao;

import com.glj.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author glj
 * @email Glj_1208@163.com
 * @date 2020-05-07 20:34:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
