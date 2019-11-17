package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.ArrayList;

@Mapper
public interface ImmunizationRecordMapper {

    @Select("select * from records ")
    public ArrayList<ImmunizationRecord> getAllRecord();
}
