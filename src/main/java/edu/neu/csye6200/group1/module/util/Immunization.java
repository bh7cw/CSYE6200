package edu.neu.csye6200.group1.module.util;

import java.util.Arrays;

public abstract class Immunization {
//    private boolean skinTestResult;
//    private boolean skinTestRequired;
    private int numOfDoses;
    private int validMonth;
    private int id;
    private String name;
    private String description;
    private int doseNum;
    private int[] daysBetweenDoses;

    public Immunization(){

    }

    public Immunization(int numOfDoses, int validMonth, int id, String name, String description, int doseNum, int[] daysBetweenDoses) {
        this.numOfDoses = numOfDoses;
        this.validMonth = validMonth;
        this.id = id;
        this.name = name;
        this.description = description;
        this.doseNum = doseNum;
        this.daysBetweenDoses = daysBetweenDoses;
    }

    public int getNumOfDoses() {
        return numOfDoses;
    }

    public void setNumOfDoses(int numOfDoses) {
        this.numOfDoses = numOfDoses;
    }

    public int getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(int validMonth) {
        this.validMonth = validMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDoseNum() {
        return doseNum;
    }

    public void setDoseNum(int doseNum) {
        this.doseNum = doseNum;
    }

    public int[] getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public void setDaysBetweenDoses(int[] daysBetweenDoses) {
        this.daysBetweenDoses = daysBetweenDoses;
    }

    @Override
    public String toString() {
        return "Immunization{" +
                "numOfDoses=" + numOfDoses +
                ", validMonth=" + validMonth +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", doseNum=" + doseNum +
                ", daysBetweenDoses=" + Arrays.toString(daysBetweenDoses) +
                '}';
    }

    public abstract boolean isValidate();
}
