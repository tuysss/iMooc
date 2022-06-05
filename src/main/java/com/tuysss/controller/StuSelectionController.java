package com.tuysss.controller;

import com.tuysss.pojo.Course;
import com.tuysss.result.Result;
import com.tuysss.service.SelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class StuSelectionController {
    @Autowired
    SelectionService selectionService;

    @RequestMapping("/api/loadCoursesToLearn")
    public List<Map> getAllCoursesToLearn(){
        List<Map> mapList=selectionService.queryAllSelections(3);
        for (Map map : mapList) {
            System.out.println(map.get("title")+" "+map.get("progress"));
        }
        return mapList;
    }

    @RequestMapping("/api/learn")
    public Result learn(@RequestBody Map requestMap){
        Object id = requestMap.get("id");
        System.out.println(" 选课id是："+id);
        if(selectionService.addProgress((int)id)!=-1){
            return new Result(200);
        }else{
            return new Result(400);
        }
    }

}
