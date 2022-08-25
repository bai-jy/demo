package com.baijingyu.service.impl;

import com.baijingyu.entity.user;
import com.baijingyu.mapper.userMapper;
import com.baijingyu.service.userService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl extends ServiceImpl<userMapper, user> implements userService {
}
