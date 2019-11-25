package edu.neu.csye6200.group1.model.extdao;

public class ExtHierarchy {
    private int classroomId;
    private int groupInfoId;
    private int studentMonth;
    private String teacherFullName;
    private String studentFullName;

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getGroupInfoId() {
        return groupInfoId;
    }

    public void setGroupInfoId(int groupInfoId) {
        this.groupInfoId = groupInfoId;
    }

    public int getStudentAge() {
        return studentMonth;
    }

    public void setStudentAge(int studentAge) {
        this.studentMonth = studentAge;
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
                ", groupId=" + groupInfoId +
                ", studentAge=" + studentMonth +
                ", teacherFullName='" + teacherFullName + '\'' +
                ", studentFullName='" + studentFullName + '\'' +
                '}';
    }
}