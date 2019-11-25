package edu.neu.csye6200.group1.module.mapper;


import edu.neu.csye6200.group1.module.extdao.ExtTeacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface AllTeacherInfoMapper {

    @Select("select * from teacher where year(register_date) = #{currentYear}")
    ArrayList<ExtTeacher> allTeacherInfo(int currentYear);
}
