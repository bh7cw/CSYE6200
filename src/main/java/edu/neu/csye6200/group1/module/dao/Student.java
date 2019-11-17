package edu.neu.csye6200.group1.module.dao;

import java.util.Date;

public class Student extends AbstractPerson {
    private int studentId;
    private String gender;
    private String firstName;
    private String lastName;
    private double gpa;
    private Date birthDate=new Date((long)999999999); // 数据库加入，无初始化
    private Date registerDate;
    private ImmunizationRecord immunizationRecord;
    private String parentFirstName;
    private String parentLastName;
    private String parentPhone;
    private String parentEmail;
    private String parentAddress;
    private String parentGender;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(String parentAddress) {
        this.parentAddress = parentAddress;
    }

    public String getParentGender() {
        return parentGender;
    }

    public void setParentGender(String parentGender) {
        this.parentGender = parentGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                ", birthDate=" + birthDate +
                ", registerDate=" + registerDate +
                ", immunizationRecord=" + immunizationRecord +
                ", parentFirstName='" + parentFirstName + '\'' +
                ", parentLastName='" + parentLastName + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", parentAddress='" + parentAddress + '\'' +
                ", parentGender='" + parentGender + '\'' +
                '}';
    }
}