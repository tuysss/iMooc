package com.tuysss.dao;

import com.tuysss.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    //根据用户id查询用户
    User getUserById(@Param("id") int id);

    //根据用户名+密码+身份联合查询用户，登录时用
    User getUser(@Param("name")String name,@Param("password")String password,@Param("role")int role);

    //查询全部用户
    List<User> getAllUsers();

    //添加用户，即注册，暂时用不到
    int addUser(User user);

    //修改用户信息，暂时不涉及密码修改，所以用不到
    int updateUser(User user);

}
