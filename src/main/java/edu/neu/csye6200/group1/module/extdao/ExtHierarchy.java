package edu.neu.csye6200.group1.module.extdao;

public class ExtHierarchy {
    private int classroomId;
    private int groupId;
    private int studentAge;
    private String teacherFullName;
    private String studentFullName;

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getTeacherFullName() {
        return teacherFullName;
    }

    public void setTeacherFullName(String teacherFullName) {
        this.teacherFullName = teacherFullName;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    @Override
    public String toString() {
        return "ExtHierarchy{" +
                "classroomId=" + classroomId +
                ", groupId=" + groupId +
                ", studentAge=" + studentAge +
                ", teacherFullName='" + teacherFullName + '\'' +
                ", studentFullName='" + studentFullName + '\'' +
                '}';
    }

    public void setGroupInfoId(int groupInfoId) {
    }
}