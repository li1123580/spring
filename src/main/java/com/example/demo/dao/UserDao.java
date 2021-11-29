package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-07 15:32:44
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}