package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.ArrayList;
import java.util.Date;

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

    /**
     * for 001 vaccine
     * @param id
     * @param date
     */
    //updet injedct date
    @Update("update records set date_001 = #{date} where stu_id = #{id}")
    void updateInject001(int id, Date date);

    //get inject date
    @Select("select date_001 from records where stu_id = #{id}")
    Date getInjectDate001(int id);

    //get inject times
    @Select("select dose_001 from records where stu_id = #{id}")
    Integer getTimes001(int id);

    //update inject times
    @Update("update records set dose_001 = #{dose} where stu_id = #{id}")
    void updateDose001(int id, int dose);


    /**
     * for 002 vaccine
     * @param id
     * @param date
     */
    //updet injedct date
    @Update("update records set date_002 = #{date} where stu_id = #{id}")
    void updateInject002(int id, Date date);

    //get inject date
    @Select("select date_002 from records where stu_id = #{id}")
    Date getInjectDate002(int id);

    //get inject times
    @Select("select dose_002 from records where stu_id = #{id}")
    Integer getTimes002(int id);

    //update inject times
    @Update("update records set dose_002 = #{dose} where stu_id = #{id}")
    void updateDose002(int id, int dose);

    /**
     * for 003 vaccine
     * @param id
     * @param date
     */
    //updet injedct date
    @Update("update records set date_003 = #{date} where stu_id = #{id}")
    void updateInject003(int id, Date date);

    //get inject date
    @Select("select date_003 from records where stu_id = #{id}")
    Date getInjectDate003(int id);

    //get inject times
    @Select("select dose_003 from records where stu_id = #{id}")
    Integer getTimes003(int id);

    //update inject times
    @Update("update records set dose_003 = #{dose} where stu_id = #{id}")
    void updateDose003(int id, int dose);

}
