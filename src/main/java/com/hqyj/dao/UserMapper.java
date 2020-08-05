package com.hqyj.dao;

import com.hqyj.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(Long userId);

    int updateByPrimaryKey(User record);

    List<User> selectUserList(User user);

    User selectByLoginName(String loginName);

    int updateInfoById(long userId);
}