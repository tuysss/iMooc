package com.tuysss.controller;

import com.tuysss.mapper.UserMapper;
import com.tuysss.pojo.User;
import com.tuysss.result.Result;
import com.tuysss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session){
        User user = userService.getLoginUser(requestUser.getName(), requestUser.getPassword(), requestUser.getRole());
        if(user==null){
            return new Result(400);
        }else{
            session.setAttribute("user",user);
            return new Result(200);
        }
    }


}
