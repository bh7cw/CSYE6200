package edu.neu.csye6200.group1.model.service;

import edu.neu.csye6200.group1.model.dao.Student;
import edu.neu.csye6200.group1.model.dao.Teacher;
import edu.neu.csye6200.group1.model.extdao.ExtHierarchy;
import edu.neu.csye6200.group1.model.mapper.HierarchyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        int currentYear=calendar.get(Calendar.YEAR);
        List<Student> allStudentList=hierarchyMapper.getAllStudentList(currentYear);
        for (Student student:allStudentList){
            ExtHierarchy extHierarchy=new ExtHierarchy();
            String studentFullName=student.getFirstName()+" "+student.getLastName();
            int studentId=student.getStudentId();
            int month=calculateMonth(currentDate, student.getBirthDate());
            extHierarchy.setStudentAge(month);
            extHierarchy.setStudentFullName(studentFullName);
            int teacherId=hierarchyMapper.getTeacherIdByStudentId(studentId);
            Teacher teacher=hierarchyMapper.getTeacherByTeacherId(teacherId);
            String teacherFullName=teacher.getFirstName()+" "+teacher.getLastName();
            extHierarchy.setTeacherFullName(teacherFullName);
            int groupInfoId=hierarchyMapper.getGroupInfoIdByTeacherId(teacherId);
            extHierarchy.setGroupInfoId(groupInfoId);
            int classroomId=hierarchyMapper.getClassroomIdByGroupInfoId(groupInfoId);
            extHierarchy.setClassroomId(classroomId);
            extHierarchyList.add(extHierarchy);
        }
        return (ArrayList<ExtHierarchy>) extHierarchyList;
    }

    public void createHierarchy(){
        // Clear the three relation tables
        hierarchyMapper.clearTeacherStudentTable();
        hierarchyMapper.clearGroupInfoTeacherTable();
        hierarchyMapper.clearClassroomGroupInfoTable();
        Calendar calendar = Calendar.getInstance();
        Date currentDate=calendar.getTime();
        int currentYear=calendar.get(Calendar.YEAR);
        // Generate new relation tables
        int[] teacherStudentRatio=new int[]{4,5,6,8,12,15};
        int[] classroomTeacherRatio=new int[]{3,3,3,3,2,2};
        List<Student> allStudentList=hierarchyMapper.getAllStudentList(currentYear);
        Queue<Teacher> allTeacherQueue=hierarchyMapper.getAllTeacherList(currentYear);
        // divide students into studentArrayMap by age
        Queue<Student>[] studentQueueMap=new LinkedList[6];
        Queue<Teacher>[] teacherQueueMap=new LinkedList[6];
        Queue<Integer>[] groupInfoQueueMap=new LinkedList[6];
        for (int i=0;i<6;i++){
            studentQueueMap[i]=new LinkedList<>();
            teacherQueueMap[i]=new LinkedList<>();
            groupInfoQueueMap[i]=new LinkedList<>();
        }
        for (Student student : allStudentList) {
            int currMonth = calculateMonth(currentDate, student.getBirthDate());
            if (currMonth >= 6 && currMonth <= 12) {
                studentQueueMap[0].offer(student);
            } else if (currMonth >= 13 && currMonth <= 24) {
                studentQueueMap[1].offer(student);
            } else if (currMonth >= 25 && currMonth <= 35) {
                studentQueueMap[2].offer(student);
            } else if (currMonth >= 36 && currMonth <= 47) {
                studentQueueMap[3].offer(student);
            } else if (currMonth >= 48 && currMonth <= 59) {
                studentQueueMap[4].offer(student);
            } else if (currMonth >= 60) {
                studentQueueMap[5].offer(student);
            }
        }
        int[][] countArrayMap=new int[6][3];
        for (int i=0;i<6;i++){
            // Num of students each age
            countArrayMap[i][0]=studentQueueMap[i].size();
            // Num of teachers each age
            countArrayMap[i][1]=(int)Math.ceil(((double)countArrayMap[i][0])/((double)teacherStudentRatio[i]));
            // Num of classrooms each age
            countArrayMap[i][2]=(int)Math.ceil(((double)countArrayMap[i][1])/((double)classroomTeacherRatio[i]));
        }
        // Generate Teacher-Student relation
        for (int i=0;i<6;i++){
            Queue<Student> studentOfSomeAgeQueue=studentQueueMap[i];
            int studentCount=0;
            Teacher currTeacher=null;
            while (!(studentOfSomeAgeQueue.isEmpty())){
                if (studentCount==0){
                    currTeacher=allTeacherQueue.poll();
                    teacherQueueMap[i].offer(currTeacher);
                }
                int currTeacherId=currTeacher.getTeacherId();
                Student currStudent=studentOfSomeAgeQueue.poll();
                studentCount=((studentCount+1)%teacherStudentRatio[i]);
                int currStudentId=currStudent.getStudentId();
                hierarchyMapper.insertTeacherStudentTable(currTeacherId, currStudentId);
            }
        }
        // Generate GroupInfo-Teacher relation
        for (int i=0;i<6;i++){
            Queue<Teacher> teacherOfSomeAgeQueue=teacherQueueMap[i];
            int groupInfoId=(i+1)*10+1;
            while (!(teacherOfSomeAgeQueue.isEmpty())){
                Teacher currTeacher=teacherOfSomeAgeQueue.poll();
                groupInfoQueueMap[i].offer(groupInfoId);
                hierarchyMapper.insertGroupInfoTeacherTable(groupInfoId++, currTeacher.getTeacherId());
            }
        }
        // Generate Classroom-GroupInfo relation
        for (int i=0;i<6;i++){
            Queue<Integer> groupInfoIdOfSomeAgeQueue=groupInfoQueueMap[i];
            int classroomId=(i+1)*1000;
            int groupCount=0;
            while (!(groupInfoIdOfSomeAgeQueue.isEmpty())){
                if (groupCount==0){
                    classroomId+=100;
                }
                int currGroupInfoId=groupInfoIdOfSomeAgeQueue.poll();
                groupCount=(groupCount+1)%classroomTeacherRatio[i];
                hierarchyMapper.insertClassroomGroupTable(classroomId, currGroupInfoId);
            }
        }
    }
}