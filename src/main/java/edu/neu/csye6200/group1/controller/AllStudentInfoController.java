package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.model.extdao.ExtStudent;
import edu.neu.csye6200.group1.model.service.AllStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Wayne Qu
 * 2019/11/18
 */

@Controller
public class AllStudentInfoController {
    @Autowired
    AllStudentInfoService allStudentInfoService;

    @ResponseBody
    @GetMapping(value="/showAllStudentInfo")
    public Map showAllStudentInfo(){
        ArrayList<ExtStudent> allStudentInfo = allStudentInfoService.getAllStudentInfo();
        Map<String,Object> map= new HashMap<>();
        map.put("total",allStudentInfo.size());
        map.put("rows",allStudentInfo);
        return map;
    }
}