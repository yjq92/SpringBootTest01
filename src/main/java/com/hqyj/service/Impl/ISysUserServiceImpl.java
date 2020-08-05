package com.hqyj.service.Impl;

import com.hqyj.dao.UserMapper;
import com.hqyj.pojo.User;
import com.hqyj.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ISysUserServiceImpl implements ISysUserService {
    @Autowired
    private UserMapper um;
    @Override
    public List<User> selectUserList(User user) {
        return um.selectUserList(user);
    }

    @Override
    public User selectByLoginName(String loginName) {
        return um.selectByLoginName(loginName);
    }

    @Override
    public User selectByPrimaryKey(long userId) {
        return um.selectByPrimaryKey(userId);
    }

    public int updateByPrimaryKeySelective(long userId) {
        return um.updateByPrimaryKeySelective(userId);
    }
}
