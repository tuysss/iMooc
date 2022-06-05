package com.tuysss.controller;

import com.tuysss.pojo.Course;
import com.tuysss.pojo.User;
import com.tuysss.result.Result;
import com.tuysss.service.CourseService;
import com.tuysss.service.SelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@RestController
public class StuCourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    SelectionService selectionService;

    @CrossOrigin
    @RequestMapping("/api/loadCourses")
    public List<Course> getAllCourse(){
        List<Course> list=courseService.queryAllcourses();
        for (Course course : list) {
            System.out.println("打印"+course.getTitle());
        }
        return list;
    }

    @CrossOrigin
    @RequestMapping("/api/choose")
    public Result selectCourse(@RequestBody Map requestMap){
        Object sid =requestMap.get("sid");
        Object cid =requestMap.get("cid");
        System.out.println("学生id："+sid+"课程id："+cid+" "+ sid.getClass());
        if(sid!=null&&cid!=null){
            selectionService.addSelection((int) sid, (int) cid);
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}
