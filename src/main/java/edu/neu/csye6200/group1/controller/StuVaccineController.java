package edu.neu.csye6200.group1.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.service.StuVaccineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Controller
public class StuVaccineController {
    @Autowired
    StuVaccineService stuVaccineService;

    @ResponseBody
    @GetMapping("/stuVaccine/{id}")
    public ImmunizationRecord getStuVaccine(@PathVariable("id") Integer id){
        return stuVaccineService.getVaccineRecord(id);
    }



    //update inject 001
    @ResponseBody
    @RequestMapping(value = "/inject001/{id}", method = RequestMethod.POST)
    public Map inject001(@PathVariable("id") Integer id, @RequestBody String requestString) throws ParseException {

        ImmunizationRecord immunizationRecord=new Gson().fromJson(requestString, new TypeToken<ImmunizationRecord>(){}.getType());

        Date date = immunizationRecord.getDate001();

        Map<String,Object> map = new HashMap<>();
        stuVaccineService.inject001(id, date,map);
        return map;


    }

    //update inject 002
    @ResponseBody
    @RequestMapping(value = "/inject002/{id}", method = RequestMethod.POST)
    public Map inject002(@PathVariable("id") Integer id, @RequestBody String requestString) throws ParseException {
        ImmunizationRecord immunizationRecord=new Gson().fromJson(requestString, new TypeToken<ImmunizationRecord>(){}.getType());
        Date date = immunizationRecord.getDate002();
        Map<String,Object> map = new HashMap<>();
        stuVaccineService.inject001(id, date,map);
        return map;


    }
    //update inject 003
    @ResponseBody
    @RequestMapping(value = "/inject003/{id}", method = RequestMethod.POST)
    public Map inject003(@PathVariable("id") Integer id, @RequestBody String requestString) throws ParseException {
        ImmunizationRecord immunizationRecord=new Gson().fromJson(requestString, new TypeToken<ImmunizationRecord>(){}.getType());
        Date date = immunizationRecord.getDate003();
        Map<String,Object> map = new HashMap<>();
        stuVaccineService.inject003(id, date,map);
        return map;
    }

}
