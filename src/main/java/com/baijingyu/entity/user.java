package com.baijingyu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class user {
    @TableId(type= IdType.AUTO)
    private Integer usid;
    private String name;
    private String password;
    private String cardId;
    private String phone;
    private String sex;


}
