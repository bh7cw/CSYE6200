package edu.neu.csye6200.group1.module.dao;

import java.util.Date;

public class Student extends AbstractPerson {
    private int studentId;
    private double gpa;
    private Date birthDate=new Date((long)999999999); // 数据库加入，无初始化
    private ImmunizationRecord immunizationRecord;
    private String parentFirstName;
    private String parentLastName;
    private String parentPhone;
    private String parentEmail;
    private String parentAddress;
    private String parentGender;

    public Student(){

    }

    public Student(String CSVString){

    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
                "studentId=" + getStudentId() +
                ", gender='" + getGender() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gpa=" + getGpa() +
                ", birthDate=" + getBirthDate() +
                ", registerDate=" + getRegisterDate() +
                ", immunizationRecord=" + getImmunizationRecord() +
                ", parentFirstName='" + getParentFirstName() + '\'' +
                ", parentLastName='" + getParentLastName() + '\'' +
                ", parentPhone='" + getParentPhone() + '\'' +
                ", parentEmail='" + getParentEmail() + '\'' +
                ", parentAddress='" + getParentAddress() + '\'' +
                ", parentGender='" + getParentGender() + '\'' +
                '}';
    }

    /**
     * csv format :
     * studentId + student firstname + student lastname + student gender + student GPA + student birthday + student registration date
     * parent firstname + parent lastname + parent gender + parent phone + parent email + parent address
     * @return a csv String
     */
    @Override
    public String toCSVString() {
        return getStudentId() + "," +
                getFirstName() + "," +
                getLastName() + "," +
                getGender() + "," +
                getGpa() + "," +
                getBirthDate() + "," +
                getRegisterDate() + "," +
                getParentFirstName() + "," +
                getParentLastName() + "," +
                getParentGender() + "," +
                getParentPhone() + "," +
                getParentEmail() + "," +
                getParentAddress();
    }
}