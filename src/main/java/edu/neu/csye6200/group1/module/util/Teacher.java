package edu.neu.csye6200.group1.module.util;

import java.util.Date;

public class Teacher extends Person {
    /**
     * @Param
     * teacherID: Teacher's ID
     * credits: Don't know
     * wage: Teacher's wage
     * registerDate: Teacher's registrar date
     */
    private int teacherID;
    private int credits;
    private double wage;
    private Date registerDate;

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
