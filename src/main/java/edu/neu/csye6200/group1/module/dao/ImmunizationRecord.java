package edu.neu.csye6200.group1.module.dao;


import java.util.Date;

/**
 * immunizationRecord
 * 001: Hib
 * 002: DTaP
 * 003: Polio
 * 004: HB
 * 005: MMR
 * 006: Varicella
 * dose00X: dose number finished of corresponding vaccine
 * date00X: the latest inject date of corresponding vaccine
 * require00X: the student pass the skin test or not
 */
public class ImmunizationRecord {
    private int stuID;

    private int dose001;
    private Date date001;
    private boolean require001;

    private int dose002;
    private Date date002;
    private boolean require002;

    private int dose003;
    private Date date003;
    private boolean require003;

    private int dose004;
    private Date date004;
    private boolean require004;

    private int dose005;
    private Date date005;
    private boolean require005;

    private int dose006;
    private Date date006;
    private boolean require006;

    public ImmunizationRecord() {

    }

    /**
     * csv input format:
     *  Student Id + the current dose # of Hib + last injection date for Hib
     *  + the current dose # of DTaP + last injection date for DTaP
     *  + the current dose # of Polio + last injection date for Polio
     *  + the current dose # of HB + last injection date for HB + Is ST required to inject HB
     *  + the current dose # of MMR + last injection date for MMR + Is ST required to inject MMR
     *  + the current dose # of Varicella + last injection date for Varicella + Is ST required to inject Varicella
     * @param CSVString an input csv string from FileUtil to create a new immunization record with 16 attributes
     */
    public ImmunizationRecord(String CSVString){
        String[] fields = CSVString.split(",");
        if(fields.length != 16) throw new IllegalArgumentException("The attributes for input Immunization record must be 16: " +
                "Student Id + the current dose # of Hib + last injection date for Hib\n" +
                " + the current dose # of DTaP + last injection date for DTaP\n" +
                " + the current dose # of Polio + last injection date for Polio\n" +
                " + the current dose # of HB + last injection date for HB + Is ST required to inject HB\n" +
                " + the current dose # of MMR + last injection date for MMR + Is ST required to inject MMR\n" +
                " + the current dose # of Varicella + last injection date for Varicella + Is ST required to inject Varicella");

        this.setStuID(FileUtil.strToInt(fields[0]));
        this.setDose001(FileUtil.strToInt(fields[1]));
        this.setDate001(FileUtil.strToDate(fields[2]));
        //this.setRequire001(FileUtil.strToBoolean(fields[3]));
        this.setDose002(FileUtil.strToInt(fields[3]));
        this.setDate002(FileUtil.strToDate(fields[4]));
        //this.setRequire002(FileUtil.strToBoolean(fields[6]));
        this.setDose003(FileUtil.strToInt(fields[5]));
        this.setDate003(FileUtil.strToDate(fields[6]));
        //this.setRequire003(FileUtil.strToBoolean(fields[9]));
        this.setDose004(FileUtil.strToInt(fields[7]));
        this.setDate004(FileUtil.strToDate(fields[8]));
        this.setRequire004(FileUtil.strToBoolean(fields[9]));
        this.setDose005(FileUtil.strToInt(fields[10]));
        this.setDate005(FileUtil.strToDate(fields[11]));
        this.setRequire005(FileUtil.strToBoolean(fields[12]));
        this.setDose006(FileUtil.strToInt(fields[13]));
        this.setDate006(FileUtil.strToDate(fields[14]));
        this.setRequire006(FileUtil.strToBoolean(fields[15]));

    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getDose001() {
        return dose001;
    }

    public void setDose001(int dose001) {
        this.dose001 = dose001;
    }

    public Date getDate001() {
        return date001;
    }

    public void setDate001(Date date001) {
        this.date001 = date001;
    }

    public int getDose002() {
        return dose002;
    }

    public void setDose002(int dose002) {
        this.dose002 = dose002;
    }

    public Date getDate002() {
        return date002;
    }

    public void setDate002(Date date002) {
        this.date002 = date002;
    }

    public int getDose003() {
        return dose003;
    }

    public void setDose003(int dose003) {
        this.dose003 = dose003;
    }

    public Date getDate003() {
        return date003;
    }

    public void setDate003(Date date003) {
        this.date003 = date003;
    }

    public int getDose004() {
        return dose004;
    }

    public void setDose004(int dose004) {
        this.dose004 = dose004;
    }

    public Date getDate004() {
        return date004;
    }

    public void setDate004(Date date004) {
        this.date004 = date004;
    }

    public int getDose005() {
        return dose005;
    }

    public void setDose005(int dose005) {
        this.dose005 = dose005;
    }

    public Date getDate005() {
        return date005;
    }

    public void setDate005(Date date005) {
        this.date005 = date005;
    }

    public int getDose006() {
        return dose006;
    }

    public void setDose006(int dose006) {
        this.dose006 = dose006;
    }

    public Date getDate006() {
        return date006;
    }

    public void setDate006(Date date006) {
        this.date006 = date006;
    }

    public boolean isRequire001() {
        return require001;
    }

    public void setRequire001(boolean require001) {
        this.require001 = require001;
    }

    public boolean isRequire002() {
        return require002;
    }

    public void setRequire002(boolean require002) {
        this.require002 = require002;
    }

    public boolean isRequire003() {
        return require003;
    }

    public void setRequire003(boolean require003) {
        this.require003 = require003;
    }

    public boolean isRequire004() {
        return require004;
    }

    public void setRequire004(boolean require004) {
        this.require004 = require004;
    }

    public boolean isRequire005() {
        return require005;
    }

    public void setRequire005(boolean require005) {
        this.require005 = require005;
    }

    public boolean isRequire006() {
        return require006;
    }

    public void setRequire006(boolean require006) {
        this.require006 = require006;
    }

    /**
     * csv output format:
     *  Student Id + the current dose # of Hib + last injection date for Hib
     *  + the current dose # of DTaP + last injection date for DTaP
     *  + the current dose # of Polio + last injection date for Polio
     *  + the current dose # of HB + last injection date for HB + Is ST required to inject HB
     *  + the current dose # of MMR + last injection date for MMR + Is ST required to inject MMR
     *  + the current dose # of Varicella + last injection date for Varicella + Is ST required to inject Varicella
     * @return a output csv string
     */
    public String toCSVString(){
        return this.getStuID() + "," +
                this.getDose001() + "," + FileUtil.dateToString(this.getDate001()) + "," + //Data for Hib Vaccine record
                this.getDose002() + "," + FileUtil.dateToString(this.getDate002()) + "," + //Data for DTaP Vaccine record
                this.getDose003() + "," + FileUtil.dateToString(this.getDate003()) + "," + //Data for Polio Vaccine record
                this.getDose004() + "," + FileUtil.dateToString(this.getDate004()) + "," + this.isRequire004() + "," + //Data for HB Vaccine record
                this.getDose005() + "," + FileUtil.dateToString(this.getDate005()) + "," + this.isRequire005() + "," + //Data for MMR Vaccine record
                this.getDose006() + "," + FileUtil.dateToString(this.getDate006()) + "," + this.isRequire006();        //Data for Varicella Vaccine record
    }


}
