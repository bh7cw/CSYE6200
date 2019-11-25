package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.model.service.MiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class MiscController {
    @Autowired
    MiscService miscService;

    /**
     * get all vaccine record
     * @return
     */
    @ResponseBody
    @GetMapping(value="/getCountNumRecord")
    public Map getCountNumRecord(){
        return miscService.getCountNumRecord();
    }
}
