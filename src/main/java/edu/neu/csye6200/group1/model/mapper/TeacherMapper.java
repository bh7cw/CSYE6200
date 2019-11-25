package edu.neu.csye6200.group1.model.mapper;

import edu.neu.csye6200.group1.model.dao.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.Date;

/**
 * the sql operation to teacher
 */
@Mapper
public interface TeacherMapper {

    // add teacher
    @Insert("insert into teacher(gender,first_name,last_name,credits,wage,register_date) " +
            "values(#{gender},#{firstName},#{lastName},#{credits},#{wage},#{registerDate})")
    void addTeacher(@Param("gender") String gender, @Param("firstName") String firstName,
                    @Param("lastName") String lastName, @Param("credits") int credits,
                    @Param("wage") double wage, @Param("registerDate") Date registerDate);

    @Delete("delete from teacher where teacher_id = #{teacherId} ")
    void deleteTeacher(@Param("teacherId") int teacherId);

    @Select("select teacher_id from teacher where first_name = #{firstName} and last_name = #{lastName} ")
    Integer findTeacherByName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Select("select * from teacher where teacherId = #{teacherId}")
    Teacher findTeacherById(int teacherId);

    @Update("update teacher set gender = #{gender}, credits = #{credits}, wage = #{wage}, " +
            "register_date = #{registerDate} where teacher_id = #{teacherId}")
    void updateTeacher(@Param("gender") String gender, @Param("credits") int credits,
                       @Param("wage") double wage,@Param("registerDate") Date registerDate, @Param("teacherId") int teacherId);
}