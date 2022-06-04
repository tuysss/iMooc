package com.tuysss.service;

import com.tuysss.dao.CourseMapper;
import com.tuysss.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> queryAllcourses() {
        return courseMapper.getAllCourse();
    }
}
