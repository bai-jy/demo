package com.baijingyu.service.impl;

import com.baijingyu.entity.role;
import com.baijingyu.mapper.roleMapper;
import com.baijingyu.service.roleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class roleServiceImpl extends ServiceImpl<roleMapper, role> implements roleService {

}
