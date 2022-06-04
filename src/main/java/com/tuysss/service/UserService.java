package com.tuysss.service;

import com.tuysss.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//@Service 只有实现类是可以实例化的
public interface UserService {
    //根据用户id查询用户
    User getUserById(@Param("id") int id);

    //查询全部用户
    List<User> getAllUsers();

    //查询登录用户是否存在，若存在返回该user，否则，返回null
    User getLoginUser(String name,String password,int role);
}
