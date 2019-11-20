package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentsDeleteService {

    @Autowired
    StudentsMapper studentsMapper;

    public Map deleteStudent(int id, Map map){
        studentsMapper.deleteStudent(id);
        map.put("msg", "delete Successful!");
        return map;
    }
}
