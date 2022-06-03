package com.tuysss.controller;


import com.tuysss.mapper.BlogMapper;
import com.tuysss.mapper.StudentMapper;
import com.tuysss.mapper.UserMapper;
import com.tuysss.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/stu")
    public String showBlogs(){
        return userMapper.selectAllUsers().stream().toString();
    }



}
