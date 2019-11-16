package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.util.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
@Mapper
public interface AllStudentInfoMapper {
    @Select("select * from students")// where register_date = #{currentYear}")
    ArrayList<Student> getAllStudentInfo(int currentYear);
}