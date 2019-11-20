package edu.neu.csye6200.group1.module.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

/**
 * the sql operation to teacher
 */
@Mapper
public interface TeacherMapper {

    // add teacher
    @Insert("insert into teacher(gender,first_name,last_name,credits,wage,register_date) " +
            "values(#{gender},{#firstName),{#lastName},{#credits},{#wage},{#registerDate}")
    void addteacher(String gender, String firstName, String lastName, int credits, double wage, Date registerDate);
}
