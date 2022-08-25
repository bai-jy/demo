package com.baijingyu.controller;

import com.baijingyu.comm.R;
import com.baijingyu.entity.user;
import com.baijingyu.entity.userRole;
import com.baijingyu.service.userRoleService;
import com.baijingyu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userroles")
public class userRoleController {
    @Autowired
    private userRoleService userRoleService;

    @PostMapping
    public R<String> save (@RequestBody userRole userRole){
        System.out.println(userRole);
        userRoleService.save(userRole);
        return R.success("添加成功");
    }
    @PutMapping
    public R<String> update(@RequestBody userRole userRole){
        System.out.println(userRole);
        userRoleService.updateById(userRole);
        return R.success("修改成功");
    }
}
