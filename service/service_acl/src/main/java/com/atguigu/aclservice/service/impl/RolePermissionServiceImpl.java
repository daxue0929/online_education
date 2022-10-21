package com.atguigu.aclservice.service.impl;

import com.atguigu.aclservice.entity.RolePermission;
import com.atguigu.aclservice.mapper.RolePermissionMapper;
import com.atguigu.aclservice.service.RolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  角色权限
 * @author daxue0929
 * @date 2022/10/19
 */

@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {
}
