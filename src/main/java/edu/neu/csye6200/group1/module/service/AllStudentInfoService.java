package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.extdao.ExtStudent;
import edu.neu.csye6200.group1.module.mapper.AllStudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author
 * Wayne Qu
 * 2019/11/18
 */

@Service
public class AllStudentInfoService {
    @Autowired
    AllStudentInfoMapper allStudentInfoMapper;

    public int calculateMonth(Date currentDate, Date birthDate){
        int res=12*(currentDate.getYear()-birthDate.getYear())+(currentDate.getMonth()-birthDate.getMonth());
        return res;
    }

    public ArrayList<ExtStudent> getAllStudentInfo(){
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        int currYear=calendar.get(Calendar.YEAR);
        ArrayList<ExtStudent> allStudentInfoList=allStudentInfoMapper.getAllStudentInfo(currYear);
        System.out.println("HERE");

         System.out.print(allStudentInfoList);
        for (ExtStudent s:allStudentInfoList){
            s.setMonth(calculateMonth(currentDate, s.getBirthDate()));
            s.setParentFullName(s.getParentFirstName()+" "+s.getParentLastName());
        }
        return allStudentInfoList;
    }
}