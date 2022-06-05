package com.tuysss.dao;

import com.tuysss.pojo.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    List<Course> getAllCourse();

    int getTeacherId(int id);
}
