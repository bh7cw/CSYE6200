package edu.neu.csye6200.group1.module;

import java.util.List;

public class Group {
    private Teacher teacher;
    private List<Student> studentList;
    int[] ageRange = new int[2];

    public Group() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int[] getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(int low, int high) {
        this.ageRange[0] = low;
        this.ageRange[1] = high;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
