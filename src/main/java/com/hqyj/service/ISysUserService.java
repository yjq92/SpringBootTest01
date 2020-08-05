package com.hqyj.service;

import com.hqyj.pojo.User;

import java.util.List;

public interface ISysUserService {
     List<User> selectUserList(User user);

     User selectByLoginName(String loginName);

     User selectByPrimaryKey(long userId);

    int updateByPrimaryKeySelective(long userId);

    //int updateInfoById(long userId);
}
