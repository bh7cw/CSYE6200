package edu.neu.csye6200.group1.module.dao;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends AbstractPerson {
    private int teacherId;
    private int credits;
    private double wage;

    public Teacher() {

    }

    public Teacher(String CSVString){

    }

    public int getTeacherID() {
        return teacherId;
    }

    public void setTeacherID(int teacherID) {
        this.teacherId = teacherID;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + getTeacherID() +
                ", firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", gender=" + getGender() +
                ", credits=" + getCredits() +
                ", wage=" + getWage() +
                ", registerDate=" + getRegisterDate() +
                '}';
    }

    /**
     * csv format:
     * teacher id + teacher firstname + teacher lastname + teacher gender + teacher credits +
     * teacher wage + teacher registerDate
     * @return
     */
    @Override
    public String toCSVString() {
        return getTeacherID() + "," +
                getFirstName() + "," +
                getLastName() + "," +
                getGender() + "," +
                getCredits() + "," +
                getWage() + "," +
                getRegisterDate();
    }
}