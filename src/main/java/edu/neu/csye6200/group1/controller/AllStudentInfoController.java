package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.extdao.ExtStudent;
import edu.neu.csye6200.group1.module.service.AllStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Controller
public class AllStudentInfoController {
    @Autowired
    AllStudentInfoService allStudentInfoService;

    @ResponseBody
    @GetMapping(value="/showAllStudentInfo")
    public Map showAllStudentInfo(){
        System.out.println("HERE");
        ArrayList<ExtStudent> allStudentInfo = allStudentInfoService.getAllStudentInfo();
        Map<String,Object> map= new HashMap<>();
        map.put("total",allStudentInfo.size());
        map.put("rows",allStudentInfo);
        return map;
    }
}
