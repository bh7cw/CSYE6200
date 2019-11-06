package edu.neu.csye6200.group1;

import java.util.Date;

public class Teacher extends Person {
    int tID;
    int credits;
    double wage;
    Date registerDate;

    public Teacher() {
    }

    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
        this.tID = tID;
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
                "tID=" + tID +
                ", credits=" + credits +
                ", wage=" + wage +
                ", registerDate=" + registerDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
