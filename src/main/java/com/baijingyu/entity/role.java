package com.baijingyu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class role {
    @TableId(type= IdType.AUTO)
    private Integer rid;
    private String roleName;
}
