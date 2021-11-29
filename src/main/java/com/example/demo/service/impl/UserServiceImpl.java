package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-01-07 15:35:01
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Resource
    private UserDao userDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return baseMapper.selectById(id);
    }

}