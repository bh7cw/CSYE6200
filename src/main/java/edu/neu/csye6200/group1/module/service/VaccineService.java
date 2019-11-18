package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.mapper.VaccineRecordMapper;
import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VaccineService {
    @Autowired
    VaccineRecordMapper testMapper;

    public ArrayList<ImmunizationRecord> getAllRecord(){
        ArrayList<ImmunizationRecord> record=testMapper.getAllRecord();
//        System.out.println(Arrays.asList(record));
        return record;
    }
}