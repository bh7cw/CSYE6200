package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.mapper.MiscMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MiscService {
    @Autowired
    MiscMapper miscMapper;

    public Map getCountNumRecord() {
        Calendar calendar = Calendar.getInstance();
        int currYear=calendar.get(Calendar.YEAR);
        Map<String, Integer> result=new HashMap<>();
        ArrayList<Integer> allStudentIdList=miscMapper.getStudentIdList(currYear);
        ArrayList<Integer> allTeacherIdList=miscMapper.getTeacherIdList(currYear);
        int validRecordNum=0;
        for (int studentId:allStudentIdList){
            ImmunizationRecord currImmunizationRecord=miscMapper.getRecordByStudentId(studentId);
            if (currImmunizationRecord!=null){
                validRecordNum++;
            }
        }
        result.put("studentNum", allStudentIdList.size());
        result.put("teacherNum", allTeacherIdList.size());
        result.put("recordNum", validRecordNum);
        return result;
    }
}
