package edu.neu.csye6200.group1.module.dao;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends AbstractPerson {
    private int teacherID;
    private int credits;
    private double wage;
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
