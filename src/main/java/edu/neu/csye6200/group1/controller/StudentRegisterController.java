package edu.neu.csye6200.group1.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.service.HierarchyService;
import edu.neu.csye6200.group1.module.service.StudentRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * student register
 */
@Controller
public class StudentRegisterController {
    @Autowired
    StudentRegisterService studentRegisterService;
    @Autowired
    HierarchyService hierarchyService;


    @ResponseBody
    @PostMapping("/register")
//    public Object signUp( @RequestBody String requestString) {
//
//        Student student=new Gson().fromJson(requestString, new TypeToken<Student>(){}.getType());
    public Map register(@RequestBody String requestString){
        Student student = new Gson().fromJson(requestString, new TypeToken<Student>(){}.getType());
        Map<String,Object> map = new HashMap<>();
        studentRegisterService.register(student,map);
        hierarchyService.createHierarchy();
        return map;
    }
}
