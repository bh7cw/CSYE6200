package edu.neu.csye6200.group1.module.mapper;

import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.dao.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author WayneQu
 * 2019/11/19
 */
@Mapper
public interface HierarchyMapper {
    @Insert("insert into teacher_student (teacher_id, student_id) value(#{teacherId},#{studentId})")
    void insertTeacherStudentTable(int teacherId, int studentId);

    @Insert("insert into group_info_teacher (group_info_id, teacher_id) value(#{groupInfoId}, #{teacherId})")
    void insertGroupInfoTeacherTable(int groupInfoId, int teacherId);

    @Insert("insert into classroom_group_info (classroom_id, group_info_id) value(#{classroomId}, #{groupInfoId})")
    void insertClassroomGroupTable(int classroomId, int groupInfoId);

    @Select("select teacher_id from teacher_student where student_id=#{studentId}")
    int getTeacherIdByStudentId(int studentId);

    @Select("select group_info_id from group_info_teacher where teacher_id=#{teacherId}")
    int getGroupInfoIdByTeacherId(int teacherId);

    @Select("select classroom_id from classroom_group_info where group_info_id=#{groupInfoId}")
    int getClassroomIdByGroupInfoId(int groupInfoId);

    @Select("select distinct classroom_id from classroom")
    List<Integer> getClassroomIdList();

    @Select("select group_info_id from classroom_group_info where classroom_id=#{classroomId}")
    List<Integer> getGroupInfoIdListByClassroomId(int classroomId);

    @Select("select teacher_id from group_info_teacher where group_info_id=#{groupInfoId}")
    int getTeacherIdByGroupInfoId(int groupInfoId);

    @Select("select * from teacher where teacher_id=#{teacherId}")
    Teacher getTeacherByTeacherId(int teacherId);

    @Select("select student_id from teacher_student where teacher_id=#{teacherId}")
    List<Integer> getStudentIdListByTeacherId(int teacherId);

    @Select("select * from student where student_id=#{studentId}")
    Student getStudentByStudentId(int studentId);

    @Select("select * from student where year(register_date)=#{currentYear}")
    List<Student> getAllStudentList(int currentYear);

    @Select("select * from teacher where year(register_date)=#{currentYear}")
    LinkedList<Teacher> getAllTeacherList(int currentYear);

    @Delete("delete from classroom_group_info")
    void clearClassroomGroupInfoTable();

    @Delete("delete from group_info_teacher")
    void clearGroupInfoTeacherTable();

    @Delete("delete from teacher_student")
    void clearTeacherStudentTable();


}