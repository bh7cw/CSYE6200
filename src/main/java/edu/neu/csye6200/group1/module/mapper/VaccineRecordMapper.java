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
    //update inject date
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
    //update inject date
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
    //update inject date
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


    /**
     * for 004 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update records set date_004= #{date} where stu_id = #{id}")
    void updateInject004(int id, Date date);

    //get inject date
    @Select("select date_004 from records where stu_id = #{id}")
    Date getInjectDate004(int id);

    //get inject times
    @Select("select dose_004 from records where stu_id = #{id}")
    Integer getTimes004(int id);

    //update inject times
    @Update("update records set dose_004 = #{dose} where stu_id = #{id}")
    void updateDose004(int id, int dose);


    /**
     * for 005 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update records set date_005= #{date} where stu_id = #{id}")
    void updateInject005(int id, Date date);

    //get inject date
    @Select("select date_005 from records where stu_id = #{id}")
    Date getInjectDate005(int id);

    //get inject times
    @Select("select dose_005 from records where stu_id = #{id}")
    Integer getTimes005(int id);

    //update inject times
    @Update("update records set dose_005 = #{dose} where stu_id = #{id}")
    void updateDose005(int id, int dose);


    /**
     * for 005 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update records set date_006= #{date} where stu_id = #{id}")
    void updateInject006(int id, Date date);

    //get inject date
    @Select("select date_006 from records where stu_id = #{id}")
    Date getInjectDate006(int id);

    //get inject times
    @Select("select dose_006 from records where stu_id = #{id}")
    Integer getTimes006(int id);

    //update inject times
    @Update("update records set dose_006 = #{dose} where stu_id = #{id}")
    void updateDose006(int id, int dose);



}
