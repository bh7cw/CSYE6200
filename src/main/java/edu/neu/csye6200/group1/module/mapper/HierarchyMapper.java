package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.Classroom;
import edu.neu.csye6200.group1.module.dao.GroupInfo;
import edu.neu.csye6200.group1.module.dao.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @Author WayneQu
 * 2019/11/19
 */
@Mapper
public interface HierarchyMapper {
    @Select("select * from classroom")
    List<Classroom> getClassroomList();

    @Select("select * from groupInfo where classroomId=#{classroomId}")
    List<GroupInfo> getGroupInfoList(int classroomId);

    @Select("select teacherId from teacher where teacherId=#{teacherId}")
    String getTeacherFullNameById(int teacherId);

    @Select("select * from student where studentId=#{studentId}")
    List<Student> getStudentListById(int teacherId);
}