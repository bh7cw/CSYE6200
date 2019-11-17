package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.service.StuVaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuVaccineController {
    @Autowired
    StuVaccineService stuVaccineService;

    @ResponseBody
    @GetMapping("/stuVaccine/{id}")
    public ImmunizationRecord getStuVaccine(@PathVariable("id") Integer id){
        return stuVaccineService.getVaccineRecord(id);
    }
}
