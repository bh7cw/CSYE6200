package edu.neu.csye6200.group1.module.extdao;

import edu.neu.csye6200.group1.module.dao.Teacher;

import java.util.Date;
import java.util.List;

public class ExtTeacher extends Teacher {
//    List<ExtStudent> extStudentList;
    private int teacherId;
    private Date registerDate;
    private double wage;
    private String gender;
    private String firstName;
    private String LastName;
    private String teacherFullName;


    @Override
    public Date getRegisterDate() {
        return registerDate;
    }

    @Override
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getTeacherFullName() {
        return teacherFullName;
    }

    public void setTeacherFullName(String teacherFullName) {
        this.teacherFullName = teacherFullName;
    }

    @Override
    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public double getWage() {
        return wage;
    }

    @Override
    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
