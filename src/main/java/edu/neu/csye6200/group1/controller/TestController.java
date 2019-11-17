package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.service.TestService;
import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    TestService testService;

    @ResponseBody
    @GetMapping(value="/vaccineRecord22")
    public Map getAllRecord(){

        ArrayList<ImmunizationRecord> allRecord = testService.getAllRecord();
        Map<String,Object> map= new HashMap<>();
        map.put("total",allRecord.size());
        map.put("rows",allRecord);
        return map;

    }
}
