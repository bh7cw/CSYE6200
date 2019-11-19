package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.Classroom;
import edu.neu.csye6200.group1.module.dao.GroupInfo;
import edu.neu.csye6200.group1.module.dao.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HierarchyMapper {
    @Select("select * from classroom")
    List<Classroom> getClassroomList();

    @Select("select * from groupInfo where ")
    List<GroupInfo> getGroupInfoList(int classroomId);

    String getTeacherFullName(int teacherId);

    List<Student> getStudentList(int teacherId);

    String getTeacherFullNameById(int teacherId);

    List<Student> getStudentListById(int teacherId);
}
