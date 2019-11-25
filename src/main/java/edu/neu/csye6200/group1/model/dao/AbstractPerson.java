package edu.neu.csye6200.group1.model.dao;

import java.util.Date;

public abstract class AbstractPerson {

    private String gender;
    private String firstName;
    private String lastName;
    private Date registerDate;

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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Convert the object into a csv String based on the object data
     * @return  a csv String
     */
    public abstract String toCSVString();
}