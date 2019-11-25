package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class VaccineController {
    @Autowired
    VaccineService vaccineService;

    /**
     * get all vaccine record
     * @return
     */
    @ResponseBody
    @GetMapping(value="/vaccineRecord")
    public Map getAllRecord(){

        ArrayList<ImmunizationRecord> allRecord = vaccineService.getAllRecord();
        Map<String,Object> map= new HashMap<>();
        map.put("total",allRecord.size());
        map.put("rows",allRecord);
        return map;

    }


}
