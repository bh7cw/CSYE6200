package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.dao.Teacher;
import edu.neu.csye6200.group1.module.extdao.ExtHierarchy;
import edu.neu.csye6200.group1.module.mapper.HierarchyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author WayneQu
 * 2019/11/20
 */
@Service
public class HierarchyService {
    @Autowired
    HierarchyMapper hierarchyMapper;

    public int calculateMonth(Date currentDate, Date birthDate){
        int res=12*(currentDate.getYear()-birthDate.getYear())+(currentDate.getMonth()-birthDate.getMonth());
        return res;
    }

    public ArrayList<ExtHierarchy> getHierarchy(){
        List<ExtHierarchy> extHierarchyList=new ArrayList<>();
        List<Integer> classroomList=hierarchyMapper.getClassroomIdList();
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        for (int classroomId: classroomList){
            List<Integer> groupInfoList=hierarchyMapper.getGroupInfoIdListByClassroomId(classroomId);
            for (int groupInfoId:groupInfoList){
                int teacherId=hierarchyMapper.getTeacherIdByGroupInfoId(groupInfoId);
                Teacher teacher=hierarchyMapper.getTeacherByTeacherId(teacherId);
                String teacherFullName=teacher.getFirstName()+" "+teacher.getLastName();
                List<Integer> studentIdList=hierarchyMapper.getStudentIdListByTeacherId(teacherId);
                for (int studentId:studentIdList){
                    Student student=hierarchyMapper.getStudentByStudentId(studentId);
                    String studentFullName=student.getFirstName()+" "+student.getLastName();
                    int month=calculateMonth(currentDate, student.getBirthDate());
                    ExtHierarchy extHierarchy=new ExtHierarchy();
                    extHierarchy.setClassroomId(classroomId);
                    extHierarchy.setGroupInfoId(groupInfoId);
                    extHierarchy.setTeacherFullName(teacherFullName);
                    extHierarchy.setStudentFullName(studentFullName);
                    extHierarchy.setStudentAge(month);
                    extHierarchyList.add(extHierarchy);
                }
            }
        }
        return (ArrayList<ExtHierarchy>) extHierarchyList;
    }

    public void createHierarchy(){
        // Clear the three relation tables
        hierarchyMapper.clearTeacherStudentTable();
        hierarchyMapper.clearGroupInfoTeacherTable();
        hierarchyMapper.clearClassroomGroupInfoTable();
        // Generate new relation tables
        int[] teacherStudentRatio=new int[]{4,5,6,8,12,15};
        int[] classroomTeacherRatio=new int[]{3,3,3,3,2,2};
        List<Student> allStudentList=hierarchyMapper.getAllStudentList();
        List<Teacher> allTeacherList=hierarchyMapper.getAllTeacherList();
        // divide students into studentArrayMap by age
        ArrayList<Student>[] studentArrayMap=new ArrayList[6];
        ArrayList<Teacher>[] teacherArrayMap=new ArrayList[6];
        ArrayList<Integer>[] groupInfoArrayMap=new ArrayList[6];
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        for (Student student : allStudentList){
            int currMonth=calculateMonth(currentDate, student.getBirthDate());
            if (currMonth>=6 && currMonth<=12){
                if (studentArrayMap[0]==null){
                    studentArrayMap[0]= new ArrayList<>();
                }
                studentArrayMap[0].add(student);
            } else if (currMonth>=13 && currMonth<=24){
                if (studentArrayMap[1]==null){
                    studentArrayMap[1]= new ArrayList<>();
                }
                studentArrayMap[1].add(student);
            } else if (currMonth>=25 && currMonth<=35){
                if (studentArrayMap[2]==null){
                    studentArrayMap[2]= new ArrayList<>();
                }
                studentArrayMap[2].add(student);
            } else if (currMonth>=36 && currMonth<=47){
                if (studentArrayMap[3]==null){
                    studentArrayMap[3]= new ArrayList<>();
                }
                studentArrayMap[3].add(student);
            } else if (currMonth>=48 && currMonth<=59){
                if (studentArrayMap[4]==null){
                    studentArrayMap[4]= new ArrayList<>();
                }
                studentArrayMap[4].add(student);
            } else if (currMonth>=60) {
                if (studentArrayMap[5] == null) {
                    studentArrayMap[5] = new ArrayList<>();
                }
                studentArrayMap[5].add(student);
            }
            int[][] countArrayMap=new int[6][3];
            for (int i=0;i<6;i++){
                // Num of students each age
                countArrayMap[i][0]=studentArrayMap[i].size();
                // Num of teachers each age
                countArrayMap[i][1]=(int)Math.ceil(((double)countArrayMap[i][0])/((double)teacherStudentRatio[i]));
                // Num of classrooms each age
                countArrayMap[i][2]=(int)Math.ceil(((double)countArrayMap[i][1])/((double)classroomTeacherRatio[i]));
            }
            // Generate Teacher-Student relation
            int teacherIndex=0;
            for (int i=0;i<6;i++){
                teacherArrayMap[i]=new ArrayList<>();
                List<Student> studentOfSomeAgeList=studentArrayMap[i];
                for (int j=0;j<countArrayMap[i][1];j++){
                    Teacher currTeacher=allTeacherList.get(teacherIndex++);
                    teacherArrayMap[i].add(currTeacher);
                    for (int k=j*teacherStudentRatio[i];k<Math.min((j+1)*teacherStudentRatio[i], countArrayMap[i][0]);k++) {
                        Student currStudent=studentOfSomeAgeList.get(k);
                        hierarchyMapper.insertStudentTeacherTable(currStudent.getStudentId(), currTeacher.getTeacherID());
                    }
                }
            }
            // Generate GroupInfo-Teacher relation
            for (int i=0;i<6;i++){
                List<Teacher> teacherOfSomeAgeList=teacherArrayMap[i];
                groupInfoArrayMap[i]=new ArrayList<>();
                int groupInfoId=(i+1)*10;
                for (int j=0;j<teacherOfSomeAgeList.size();j++){
                    Teacher currTeacher=teacherOfSomeAgeList.get(j);
                    groupInfoArrayMap[i].add(groupInfoId);
                    hierarchyMapper.insertTeacherGroupInfoTable(groupInfoId++, currTeacher.getTeacherID());
                }
            }
            // Generate Classroom-GroupInfo relation
            for (int i=0;i<6;i++){
                List<Integer> groupInfoIdOfSomeAgeList=groupInfoArrayMap[i];
                int classroomId=(i+1)*1000;
                for (int j=0;j<groupInfoIdOfSomeAgeList.size();j++){
                    if (j%classroomTeacherRatio[i]==0){
                        classroomId+=100;
                    }
                    int currGroupInfoId=groupInfoIdOfSomeAgeList.get(j);
                    hierarchyMapper.insertGroupClassroomTable(classroomId, currGroupInfoId);
                }
            }
        }
    }
}