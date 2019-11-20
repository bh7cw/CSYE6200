package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.Classroom;
import edu.neu.csye6200.group1.module.dao.GroupInfo;
import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.extdao.ExtClassroom;
import edu.neu.csye6200.group1.module.extdao.ExtHierarchy;
import edu.neu.csye6200.group1.module.mapper.AllStudentInfoMapper;
import edu.neu.csye6200.group1.module.mapper.HierarchyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class HierarchyService {
    @Autowired
    HierarchyMapper hierarchyMapper;

    public ArrayList<ExtHierarchy> getHierarchy(){
        List<ExtHierarchy> extHierarchyList=new ArrayList<>();
        List<Classroom> classroomList=hierarchyMapper.getClassroomList();
        for (Classroom classroom: classroomList){
            int classroomId=classroom.getClassroomId();
            List<GroupInfo> groupInfoList=hierarchyMapper.getGroupInfoList(classroomId);
            for (GroupInfo groupInfo:groupInfoList){
                int groupInfoId=groupInfo.getGroupInfoId();
                int teacherId=groupInfo.getTeacherId();
                String teacherFullName=hierarchyMapper.getTeacherFullNameById(teacherId);
                List<Student> studentList=hierarchyMapper.getStudentListById(teacherId);
                for (Student student:studentList){
                    String studentFullName=student.getFirstName()+" "+student.getLastName();
                    ExtHierarchy extHierarchy=new ExtHierarchy();
                    extHierarchy.setClassroomId(classroomId);
                    extHierarchy.setGroupInfoId(groupInfoId);
                    extHierarchy.setStudentFullName(studentFullName);
                    extHierarchy.setTeacherFullName(teacherFullName);
                    extHierarchyList.add(extHierarchy);
                }
            }
        }
        return (ArrayList<ExtHierarchy>) extHierarchyList;
    }
}