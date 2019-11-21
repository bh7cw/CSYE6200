package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import org.apache.ibatis.annotations.*;


import java.util.ArrayList;
import java.util.Date;

@Mapper
public interface VaccineRecordMapper {

    /**
     * add new record
     */
    @Insert("insert into record(" +
            "stu_id,dose_001,dose_002,dose_003,dose_004,dose_005,dose_006," +
            "date_001,date_002,date_003,date_004,date_005,date_006," +
            "require_004,require_005,require_006)" +
            "value(#{id},#{dose001},#{dose002},#{dose003},#{dose004},#{dose005},#{dose006}," +
            "#{date001},#{date002},#{date003},#{date004},#{date005},#{date006}," +
            "#{require004},#{require005},#{require006})" )
    void addrecord(@Param("id") int id,
                   @Param("dose001") int dose001, @Param("date001") Date date001,
                   @Param("dose002") int dose002, @Param("date002") Date date002,
                   @Param("dose003") int dose003, @Param("date003") Date date003,
                   @Param("dose004") int dose004, @Param("date004") Date date004,
                   @Param("dose005") int dose005, @Param("date005") Date date005,
                   @Param("dose006") int dose006, @Param("date006") Date date006,
                   @Param("require004") boolean require004, @Param("require005") boolean require005,
                   @Param("require006") boolean require006);
    /**
     * get all immunization record from record table
     * @return
     */
    @Select("select * from record ")
    ArrayList<ImmunizationRecord> getAllRecord();

    @Select("select * from record where stu_id = #{id} ")
    ImmunizationRecord getStuVaccine(int id);

    @Update("update record set dose_001 = #{dose001}, date_001 = #{date001}, dose_002 = #{dose002}, " +
            "date_002 = #{date002}, dose_003 = #{dose003}, date_003 = #{date003}, dose_004 = #{dose004}, " +
            "date_004 = #{date004}, dose_005 = #{dose005}, date_005 = #{date005}, dose_006 = #{dose006}, " +
            "date_006 = #{date006}, require_004 = #{require004}, require_005 = #{require005}, require_006 = #{require006}" +
            " where stu_id = #{id}")
    void updateAllVaccineRc(@Param("id") int id,
                            @Param("dose001") int dose001, @Param("date001") Date date001,
                            @Param("dose002") int dose002, @Param("date002") Date date002,
                            @Param("dose003") int dose003, @Param("date003") Date date003,
                            @Param("dose004") int dose004, @Param("date004") Date date004,
                            @Param("dose005") int dose005, @Param("date005") Date date005,
                            @Param("dose006") int dose006, @Param("date006") Date date006,
                            @Param("require004") boolean require004, @Param("require005") boolean require005,
                            @Param("require006") boolean require006);

    /**
     * for 001 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_001 = #{date} where stu_id = #{id}")
    void updateInject001(int id, Date date);

    //get inject date
    @Select("select date_001 from record where stu_id = #{id}")
    Date getInjectDate001(int id);

    //get inject times
    @Select("select dose_001 from record where stu_id = #{id}")
    Integer getTimes001(int id);

    //update inject times
    @Update("update record set dose_001 = #{dose} where stu_id = #{id}")
    void updateDose001(int id, int dose);


    /**
     * for 002 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_002 = #{date} where stu_id = #{id}")
    void updateInject002(int id, Date date);

    //get inject date
    @Select("select date_002 from record where stu_id = #{id}")
    Date getInjectDate002(int id);

    //get inject times
    @Select("select dose_002 from record where stu_id = #{id}")
    Integer getTimes002(int id);

    //update inject times
    @Update("update record set dose_002 = #{dose} where stu_id = #{id}")
    void updateDose002(int id, int dose);

    /**
     * for 003 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_003 = #{date} where stu_id = #{id}")
    void updateInject003(int id, Date date);

    //get inject date
    @Select("select date_003 from record where stu_id = #{id}")
    Date getInjectDate003(int id);

    //get inject times
    @Select("select dose_003 from record where stu_id = #{id}")
    Integer getTimes003(int id);

    //update inject times
    @Update("update record set dose_003 = #{dose} where stu_id = #{id}")
    void updateDose003(int id, int dose);


    /**
     * for 004 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_004= #{date} where stu_id = #{id}")
    void updateInject004(int id, Date date);

    //get inject date
    @Select("select date_004 from record where stu_id = #{id}")
    Date getInjectDate004(int id);

    //get inject times
    @Select("select dose_004 from record where stu_id = #{id}")
    Integer getTimes004(int id);

    //update inject times
    @Update("update record set dose_004 = #{dose} where stu_id = #{id}")
    void updateDose004(int id, int dose);


    /**
     * for 005 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_005= #{date} where stu_id = #{id}")
    void updateInject005(int id, Date date);

    //get inject date
    @Select("select date_005 from record where stu_id = #{id}")
    Date getInjectDate005(int id);

    //get inject times
    @Select("select dose_005 from record where stu_id = #{id}")
    Integer getTimes005(int id);

    //update inject times
    @Update("update record set dose_005 = #{dose} where stu_id = #{id}")
    void updateDose005(int id, int dose);


    /**
     * for 006 vaccine
     * @param id
     * @param date
     */
    //update inject date
    @Update("update record set date_006= #{date} where stu_id = #{id}")
    void updateInject006(int id, Date date);

    //get inject date
    @Select("select date_006 from record where stu_id = #{id}")
    Date getInjectDate006(int id);

    //get inject times
    @Select("select dose_006 from record where stu_id = #{id}")
    Integer getTimes006(int id);

    //update inject times
    @Update("update record set dose_006 = #{dose} where stu_id = #{id}")
    void updateDose006(int id, int dose);



}
