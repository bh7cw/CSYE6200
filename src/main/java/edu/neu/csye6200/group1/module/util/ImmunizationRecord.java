package edu.neu.csye6200.group1.module.util;


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
}
