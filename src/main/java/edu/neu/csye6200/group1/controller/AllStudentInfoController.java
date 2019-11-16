package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.service.AllStudentInfoService;
import edu.neu.csye6200.group1.module.service.TestService;
import edu.neu.csye6200.group1.module.util.ImmunizationRecord;
import edu.neu.csye6200.group1.module.util.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllStudentInfoController {
    @Controller
    public class TestController {
        @Autowired
        AllStudentInfoService allStudentInfoService;

        @ResponseBody
        @GetMapping(value="/showAllStudentInfo")
        public Map showAllStudentInfo(){
            System.out.println("HERE");
            ArrayList<Student> allInfo = allStudentInfoService.getAllStudentInfo();
            Map<String,Object> map= new HashMap<>();
            map.put("total",allInfo.size());
            map.put("rows",allInfo);
            return map;
        }
    }
}
