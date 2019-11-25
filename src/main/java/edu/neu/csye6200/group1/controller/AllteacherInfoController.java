package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.model.extdao.ExtTeacher;
import edu.neu.csye6200.group1.model.service.AllTeacherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AllteacherInfoController {
    @Autowired
    AllTeacherInfoService allTeacherInfoService;


    @ResponseBody
    @GetMapping(value="/showAllTeacherInfo")
    public Map showAllTeacherInfo(){
        ArrayList<ExtTeacher> allTeacherInfo = allTeacherInfoService.getAllTeacher();
        Map<String,Object> map= new HashMap<>();
        map.put("total",allTeacherInfo.size());
        map.put("rows",allTeacherInfo);
        return map;
    }
}
