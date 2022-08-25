package com.baijingyu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class userRole {
    @TableId(type= IdType.AUTO)
    private Integer urid;
    private String name;
    private String roleName;

}
