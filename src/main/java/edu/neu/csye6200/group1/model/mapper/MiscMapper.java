package edu.neu.csye6200.group1.model.mapper;

import edu.neu.csye6200.group1.model.dao.ImmunizationRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface MiscMapper {
    @Select("select distinct student_id from student where year(register_date)=#{currentYear}")
    ArrayList<Integer> getStudentIdList(int currentYear);

    @Select("select distinct teacher_id from teacher where year(register_date)=#{currentYear}")
    ArrayList<Integer> getTeacherIdList(int currentYear);

    @Select("select * from record where stu_id=#{studentId}")
    ImmunizationRecord getRecordByStudentId(int studentId);
}
