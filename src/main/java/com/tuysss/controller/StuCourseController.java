package com.tuysss.controller;

import com.tuysss.pojo.Course;
import com.tuysss.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuCourseController {
    @Autowired
    CourseService courseService;

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
    public List<Course> selectCourse(){
        List<Course> list=courseService.queryAllcourses();
        for (Course course : list) {
            System.out.println("打印"+course.getTitle());
        }
        return list;
    }
}
