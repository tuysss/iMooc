package com.tuysss.mapper;

import com.tuysss.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User row);

    int insertSelective(User row);

    List<User> selectAllUsers();

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);
}
