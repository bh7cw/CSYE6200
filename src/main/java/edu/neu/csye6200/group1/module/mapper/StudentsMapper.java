package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.Student;
import org.apache.ibatis.annotations.*;

import java.util.Date;

@Mapper
public interface StudentsMapper {
    @Insert("insert into student(gender,first_name,last_name,gpa,birth_date,register_date,parent_first_name,parent_last_name," +
            "parent_phone,parent_email,parent_address,parent_gender) values(#{gender},#{firstName},#{lastName},#{gpa},#{birthDate},#{registerDate},#{parentFirstName}," +
            "#{parentLastName},#{parentPhone},#{parentEmail},#{parentAddress},#{parentGender})")
    void addStudent(@Param("gender") String gender, @Param("firstName") String fistName, @Param("lastName") String lastName,
                           @Param("gpa") double gpa, @Param("birthDate") Date birthDate, @Param("registerDate") Date registerDate,
                           @Param("parentFirstName") String parentFirstName, @Param("parentLastName") String parentLastName,
                           @Param("parentPhone") String parentPhone, @Param("parentEmail") String parentEmail, @Param("parentAddress") String parentAddress,
                           @Param("parentGender") String parentGender);

    @Delete("delete from student where student_id = #{studentId} ")
    void deleteStudent(@Param("studentId") int studentId);

    @Select("select student_id from student where first_name = #{stuFirstName} and last_name = #{stuLastName} and " +
            "parent_first_name = #{parFirstName} and parent_last_name = #{parLastName} ")
    Integer findStuByName(@Param("stuFirstName") String stuFirstName, @Param("stuLastName") String stuLastName,
                          @Param("parFirstName") String parFirstName, @Param("parLastName") String parLastName);

    @Select("select * from student where student_id = #{studentId}")
    Student findStuById(@Param("studentId") int studentId);

    @Update("update student set gender = #{gender}, gpa = #{gpa}, parent_phone = #{parentPhone} " +
            ", parent_email = #{parentEmail}, parent_address = #{parentAddress}, birth_date = #{birthDate} " +
            ", register_date = #{registerDate} where student_id = #{studentId}")
    void updateStudent(@Param("gender") String gender, @Param("gpa") double gpa,
                       @Param("parentPhone") String parentPhone, @Param("parentEmail") String parentEmail,
                       @Param("parentAddress") String parentAddress,@Param("birthDate") Date birthDate,
                       @Param("registerDate") Date registerDate, @Param("studentId") int studentId);

}
