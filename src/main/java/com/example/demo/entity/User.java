package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-01-07 15:31:20
 */
@TableName("user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 776803023303662255L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    
    private String username;
    
    private String sex;
    
    private Object birthday;
    
    private String address;
    
    private String password;

}