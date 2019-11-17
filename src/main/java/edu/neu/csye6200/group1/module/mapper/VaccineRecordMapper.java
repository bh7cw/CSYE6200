package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.ArrayList;

@Mapper
public interface VaccineRecordMapper {

    /**
     * get all immunization records from records table
     * @return
     */
    @Select("select * from records ")
    ArrayList<ImmunizationRecord> getAllRecord();

    @Select("select * from records where stu_id = #{id} ")
    ImmunizationRecord getStuVaccine(int id);
}
