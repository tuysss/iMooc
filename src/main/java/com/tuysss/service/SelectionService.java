package com.tuysss.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectionService {
    //所有需要的课程信息回显前端
    List<Map> queryAllSelections(int studentId);

    //学生用户新增选课
    int addSelection(int studentId,int courseId);

    //学习一次
    int addProgress(int selectionId);
}
