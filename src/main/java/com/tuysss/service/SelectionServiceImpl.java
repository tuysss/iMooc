package com.tuysss.service;

import com.tuysss.dao.CourseMapper;
import com.tuysss.dao.SelectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SelectionServiceImpl implements SelectionService{
    @Autowired
    SelectionMapper selectionMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Map> queryAllSelections(int studentId) {
        return selectionMapper.queryAllSelections(studentId);
    }

    @Override
    public int addSelection(int studentId, int courseId) {
        int teacherId=courseMapper.getTeacherId(courseId);
        return selectionMapper.addSelection(studentId,courseId,teacherId);
    }

    @Override
    public int addProgress(int selectionId) {
        return selectionMapper.addProgress(selectionId);
    }
}
