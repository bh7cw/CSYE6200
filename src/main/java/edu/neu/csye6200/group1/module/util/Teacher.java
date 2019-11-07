package edu.neu.csye6200.group1.module.util;

import java.util.Date;

public class Teacher extends Person {
    private int teacherID;
    private int credits;
    private double wage;
    private Date registerDate;

    public Teacher() {
    }

    public int getteacherID() {
        return teacherID;
    }

    public void setteacherID(int teacherID) {
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
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
