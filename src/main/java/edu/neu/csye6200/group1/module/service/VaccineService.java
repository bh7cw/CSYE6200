package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.mapper.VaccineRecordMapper;
import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VaccineService {
    @Autowired
    VaccineRecordMapper vaccineRecordMapper;

    public ArrayList<ImmunizationRecord> getAllRecord(){
        Calendar calendar = Calendar.getInstance();
        int currYear=calendar.get(Calendar.YEAR);
        ArrayList<ImmunizationRecord> resultList=new ArrayList<>();
        ArrayList<Integer> validStudentIdList=vaccineRecordMapper.getValidStudentIdRecord(currYear);
        for (int studentId : validStudentIdList){
            resultList.add(vaccineRecordMapper.getImmunizationRecordByStudentId(studentId));
        }
        return resultList;
    }
}