package com.tuysss.dao;

import com.tuysss.pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SelectionMapper {
    //前端需要： 课程title，progress,cid,
    List<Map> queryAllSelections(@Param("sid") int studentId);

    //学生新增选课
    int addSelection(@Param("sid") int studentId,@Param("cid") int courseId,@Param("tid")int teacherId);

    //添加课程进度
    int addProgress(@Param("id")int selectionId);
}
