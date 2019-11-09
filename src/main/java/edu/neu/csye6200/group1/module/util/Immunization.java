package edu.neu.csye6200.group1.module.util;

public class Immunization {
    private boolean skinTest;
    private int numOfShots;
    private int period;
    private int id;
    private int daysBetweenShots;

    public Immunization() {

    }

    public boolean isSkinTest() {
        return skinTest;
    }

    public void setSkinTest(boolean skinTest) {
        this.skinTest = skinTest;
    }

    public int getNumOfShots() {
        return numOfShots;
    }

    public void setNumOfShots(int numOfShots) {
        this.numOfShots = numOfShots;
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

    public int getDaysBetweenShots() {
        return daysBetweenShots;
    }

    public void setDaysBetweenShots(int daysBetweenShots) {
        this.daysBetweenShots = daysBetweenShots;
    }

    @Override
    public String toString() {
        return "Immunization{" +
                "skinTest=" + skinTest +
                ", numOfShots=" + numOfShots +
                ", period=" + period +
                ", id=" + id +
                ", daysBetweenShots=" + daysBetweenShots +
                '}';
    }
}
