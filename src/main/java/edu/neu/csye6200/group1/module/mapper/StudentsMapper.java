package edu.neu.csye6200.group1.module.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;

@Mapper
public interface StudentsMapper {
    @Insert("insert into student(gender,first_name,last_name,gpa,birth_date,register_date,parent_first_name,parent_last_name," +
            "parent_phone,parent_email,parent_address,parent_gender) values(#{gender},#{firstName},#{lastName},#{gpa},#{birthDate},#{registerDate},#{parentFirstName}," +
            "#{parentLastName},#{parentPhone},#{parenEmail},#{parentAddress},#{parentGender})")
    void addStudent(@Param("gender") char gender, @Param("firstName") String fistName, @Param("lastName") String lastName,
                           @Param("gpa") double gpa, @Param("birthDate") Date birthDate, @Param("registerDate") Date registerDate,
                           @Param("parentFirstName") String parentFirstName, @Param("parentLastName") String parentLastName,
                           @Param("parentPhone") String parentPhone, @Param("parentEmail") String parentEmail, @Param("parentAddress") String parentAddress,
                           @Param("parentGender") String parentGender);

}
