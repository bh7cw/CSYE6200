package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.mapper.AllStudentInfoMapper;
import edu.neu.csye6200.group1.module.mapper.ImmunizationRecordMapper;
import edu.neu.csye6200.group1.module.util.ImmunizationRecord;
import edu.neu.csye6200.group1.module.util.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AllStudentInfoService {
    @Autowired
    AllStudentInfoMapper allStudentInfoMapper;

    public int calculateMonth(Date currentDate, Date birthDate){
        int res=12*(currentDate.getYear()-birthDate.getYear())+(currentDate.getMonth()-birthDate.getMonth());
        return res;
    }

    public ArrayList<Student> getAllStudentInfo(){
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        int currYear=calendar.get(Calendar.YEAR);
        ArrayList<Student> allStudentInfoList=allStudentInfoMapper.getAllStudentInfo(currYear);
        System.out.print(allStudentInfoList);
        for (Student s:allStudentInfoList){
            s.setMonth(calculateMonth(currentDate, s.getBirthDate()));
        }
        return allStudentInfoList;
    }
}
