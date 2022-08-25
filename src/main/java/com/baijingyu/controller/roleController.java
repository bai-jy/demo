package com.baijingyu.controller;


import com.baijingyu.comm.R;
import com.baijingyu.entity.role;
import com.baijingyu.service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class roleController {
    @Autowired
    private roleService roleService;

    @PostMapping
    public R<String> save (@RequestBody role role){
        roleService.save(role);
        return R.success("添加成功");
    }
    @PutMapping
    public R<String> update(@RequestBody role role){
        roleService.updateById(role);
        return R.success("修改成功");
    }
}
