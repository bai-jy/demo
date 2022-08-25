package com.baijingyu.controller;


import com.baijingyu.comm.R;
import com.baijingyu.entity.user;
import com.baijingyu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping
    public R<String> save (@RequestBody user user){

        userService.save(user);
        return R.success("添加成功");
    }
    @PutMapping
    public R<String> update(@RequestBody user user){
        userService.updateById(user);
        return R.success("修改成功");
    }



}
