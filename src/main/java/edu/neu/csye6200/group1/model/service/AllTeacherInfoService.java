package edu.neu.csye6200.group1.model.service;

import edu.neu.csye6200.group1.model.extdao.ExtTeacher;

import edu.neu.csye6200.group1.model.mapper.AllTeacherInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AllTeacherInfoService {
    @Autowired
    AllTeacherInfoMapper allTeacherInfoMapper;

    public ArrayList<ExtTeacher> getAllTeacher(){

        Calendar calendar = Calendar.getInstance();
//        Date currentDate=calendar.getTime();
        int currYear=calendar.get(Calendar.YEAR);
        ArrayList<ExtTeacher> teachers = allTeacherInfoMapper.allTeacherInfo(currYear);
        for(ExtTeacher t: teachers){
            t.setTeacherFullName(t.getFirstName()+" "+t.getLastName());
        }
        return teachers;

    }
}
