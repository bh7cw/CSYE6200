package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.mapper.VaccineRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuVaccineService {
    @Autowired
    VaccineRecordMapper vaccineRecordMapper;

    public ImmunizationRecord getVaccineRecord(int n){
        return vaccineRecordMapper.getStuVaccine(n);
    }
}
