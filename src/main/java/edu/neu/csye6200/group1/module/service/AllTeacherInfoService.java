package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.extdao.ExtTeacher;

import edu.neu.csye6200.group1.module.mapper.AllTeacherInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AllTeacherInfoService {
    @Autowired
    AllTeacherInfoMapper allTeacherInfoMapper;

    public ArrayList<ExtTeacher> getAllTeacher(){
        ArrayList<ExtTeacher> teachers = allTeacherInfoMapper.allTeacherInfo();
        for(ExtTeacher t: teachers){
            t.setTeacherFullName(t.getFirstName()+" "+t.getLastName());
        }
        return teachers;

    }
}
