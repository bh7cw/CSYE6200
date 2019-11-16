package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.service.TestService;
import edu.neu.csye6200.group1.module.util.ImmunizationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    TestService testService;

    @ResponseBody
    @GetMapping(value="/vaccineRecord")
    public ArrayList<ImmunizationRecord> getAllRecord(){
//        System.out.println("1111");
        return testService.getAllRecord();
    }
}
