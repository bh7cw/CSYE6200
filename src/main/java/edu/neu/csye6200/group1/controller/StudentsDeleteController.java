package edu.neu.csye6200.group1.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.service.StudentsDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentsDeleteController {
    @Autowired
    StudentsDeleteService studentsDeleteService;

    @ResponseBody
    @RequestMapping(value = "/deleteStu", method = RequestMethod.POST)
    public Map delete(@RequestBody String requestString){
        Student student = new Gson().fromJson(requestString, new TypeToken<Student>(){}.getType());
        int id = student.getStudentId();
        Map<String,Object> map = new HashMap<>();
        studentsDeleteService.deleteStudent(id,map);
        return map;
    }


}
