package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.Date;

/**
 * the sql operation to teacher
 */
@Mapper
public interface TeacherMapper {

    // add teacher
    @Insert("insert into teacher(gender,first_name,last_name,credits,wage,register_date) " +
            "values(#{gender},{#firstName),{#lastName},{#credits},{#wage},{#registerDate}")
    void addTeacher(String gender, String firstName, String lastName, int credits, double wage, Date registerDate);

    void deleteTeacher(@Param("teacher_id") int teacherId);

    @Select("select teacher_id from teacher where first_name = #{firstName} and last_name = #{lastName}")
    Integer findTeacherByName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Select("select * from teacher where teacherId = #{teacherId}")
    Teacher findTeacherById(int teacherId);

    @Update("update teacher set gender = #{gender}, credits = #{credits}, wage = #{wage}, " +
            ", register_date = #{registerDate} where teacherId = #{teacherId}")
    void updateTeacher(@Param("gender") String gender, @Param("credits") int credits,
                       @Param("wage") double wage,@Param("registerDate") Date registerDate, @Param("teacherId") int teacherId);
}
