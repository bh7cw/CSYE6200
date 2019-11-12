package edu.neu.csye6200.group1.module.util;

public class Parent extends Person {
    /**
     * @Param
     * phone: Parent's phone number
     * address: Parent's home address
     */
    private String phone;
    private String address;

    public Parent() {

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", address=" + address +
                ", phone=" + phone+
                '}';
    }
}
