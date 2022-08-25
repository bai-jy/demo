package com.baijingyu.service.impl;

import com.baijingyu.entity.userRole;
import com.baijingyu.mapper.userRoleMapper;
import com.baijingyu.service.userRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class userRoleServiceImpl extends ServiceImpl<userRoleMapper, userRole> implements userRoleService {
}
