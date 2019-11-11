package edu.neu.csye6200.group1.module.util;

public class Immunization {
    private boolean skinTest;
    private int numOfDoses;
    private int period;
    private int id;
    private int daysBetweenDoses;

    public Immunization() {

    }

    public boolean isSkinTest() {
        return skinTest;
    }

    public void setSkinTest(boolean skinTest) {
        this.skinTest = skinTest;
    }

    public int getNumOfDoses() {
        return numOfDoses;
    }

    public void setNumOfDoses(int numOfDoses) {
        this.numOfDoses = numOfDoses;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public void setDaysBetweenDoses(int daysBetweenDoses) {
        this.daysBetweenDoses = daysBetweenDoses;
    }

    @Override
    public String toString() {
        return "Immunization{" +
                "skinTest=" + skinTest +
                ", numOfShots=" + numOfDoses +
                ", period=" + period +
                ", id=" + id +
                ", daysBetweenShots=" + daysBetweenDoses +
                '}';
    }
}
