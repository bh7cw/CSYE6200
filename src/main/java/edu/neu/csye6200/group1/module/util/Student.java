package edu.neu.csye6200.group1.module.util;

import java.util.Date;

public class Student extends Person {
    /**
     * @Param
     * studentId: Student's ID
     * gpa: Student's GPA
     * parent: Student's parent
     * registerDate: Student's registrar date
     * immunizationRecord: Student's immunization record
     */
    private int studentId;
    private double gpa;
    private Parent parent;
    private Date registerDate;

    private ImmunizationRecord immunizationRecord;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
                "studentId=" + studentId +
                ", gpa=" + gpa +
                ", parent=" + parent +
                ", registerDate=" + registerDate +
                ", birthDate=" + super.getBirthDate() +
                ", immunizationRecord=" + immunizationRecord +
                '}';
    }
}
