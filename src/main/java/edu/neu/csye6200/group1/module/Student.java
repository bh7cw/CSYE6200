package edu.neu.csye6200.group1.module;

import java.util.Date;

public class Student extends Person {
    private int stuID;
    private double gpa;
    private Parent parent;
    private Date registerDate;
    private ImmunizationRecord immunizationRecord;

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public ImmunizationRecord getImmunizationRecord() {
        return immunizationRecord;
    }

    public void setImmunizationRecord(ImmunizationRecord immunizationRecord) {
        this.immunizationRecord = immunizationRecord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", first name=" + getFirstName() +
                ", last name=" + getLastName() +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                ", parent=" + parent +
                ", registerDate=" + registerDate +
                ", record=" + immunizationRecord +
                '}';
    }
}
