package edu.neu.csye6200.group1.module.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends AbstractPerson {
    private int teacherID;
    private int credits;
    private double wage;
    private Date registerDate;
    List<Integer> studentList=new ArrayList<>();

    public Teacher() {

    }

    public Teacher(String CSVString){

    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", credits=" + credits +
                ", wage=" + wage +
                ", registerDate=" + registerDate +
                '}';
    }
}
