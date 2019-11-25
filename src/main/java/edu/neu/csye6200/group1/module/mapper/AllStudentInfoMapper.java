package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.extdao.ExtStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

/**
 * @Author Wayne Qu
 * 2019/11/18
 */

@Mapper
public interface AllStudentInfoMapper {
    @Select("select * from student where year(register_date) = #{currentYear}")
    ArrayList<ExtStudent> getAllStudentInfoByRegisterDate(int currentYear);
}