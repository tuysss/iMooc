package com.tuysss.dao;

import org.apache.ibatis.annotations.Param;

public interface SelectionMapper {
    int selectCourse(@Param("sid") int studentId);
}
