package edu.neu.csye6200.group1.module.util;

import java.util.Date;

/**
 * wu.juan
 * Person class
 */
public class Person {
    /**
     * @Param
     * id: Person's ID
     * firstName: Person's first name
     * lastName: Person's last name
     * birthDate: Person's birth date
     * gender: Person's gender
     */
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
