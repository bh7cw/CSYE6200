package edu.neu.csye6200.group1.model.dao;

import java.util.Arrays;

public abstract class Vaccine {
    /**
     * Vaccine
     * @Param
     * id: Vaccine Id
     * name: Vaccine Name
     * totalDose: Vaccine Doses Required Totally
     * validMonth: Vaccine valid time lasting after all doses are done
     * daysBetweenDoses: The period between two doses
     * description: Other details of vaccine
     * isRequiredST: To tell if a vaccine is skin test required
     */
    private int id;
    private int totalDose;
    private int validMonth;
    private int[] daysBetweenDoses;
    private String name;
    private String description;
    private boolean isRequiredST;

    public Vaccine(){

    }

    public Vaccine(int id, int totalDose, int validMonth, int[] daysBetweenDoses, String name, String description, boolean isRequiredST) {
        this.id = id;
        this.totalDose=totalDose;
        this.validMonth = validMonth;
        this.daysBetweenDoses=daysBetweenDoses;
        this.name = name;
        this.description = description;
        this.isRequiredST = isRequiredST;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalDose() {
        return totalDose;
    }

    public void setTotalDose(int totalDose) {
        this.totalDose = totalDose;
    }

    public int getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(int validMonth) {
        this.validMonth = validMonth;
    }

    public int[] getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public void setDaysBetweenDoses(int[] daysBetweenDoses) {
        this.daysBetweenDoses = daysBetweenDoses;
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

    public boolean getIsRequiredST() {
        return isRequiredST;
    }

    public void setIsRequiredST(boolean isRequiredST) {
        this.isRequiredST = isRequiredST;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", totalDose=" + totalDose +
                ", validMonth=" + validMonth +
                ", daysBetweenDoses=" + Arrays.toString(daysBetweenDoses) +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isRequiredST=" + isRequiredST +
                '}';
    }
}
