package edu.neu.csye6200.group1.model.service;

import edu.neu.csye6200.group1.model.mapper.VaccineRecordMapper;
import edu.neu.csye6200.group1.model.dao.ImmunizationRecord;
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
            if(vaccineRecordMapper.getImmunizationRecordByStudentId(studentId)!=null)
            resultList.add(vaccineRecordMapper.getImmunizationRecordByStudentId(studentId));
        }
        return resultList;
    }
}