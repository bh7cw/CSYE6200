package edu.neu.csye6200.group1.module.extdao;

import edu.neu.csye6200.group1.module.dao.Student;

public class ExtStudent extends Student {
    private int month;
    private String studentFullName;
    private String parentFullName;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getParentFullName() {
        return parentFullName;
    }

    public void setParentFullName(String parentFullName) {
        this.parentFullName = parentFullName;
    }
}