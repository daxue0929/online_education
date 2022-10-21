package com.atguigu.aclservice.mapper;

import com.atguigu.aclservice.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author daxue0929
 * @date 2022/10/18
 */

@Mapper
@Repository
public interface UserRoleMapper  extends BaseMapper<UserRole> {
}
