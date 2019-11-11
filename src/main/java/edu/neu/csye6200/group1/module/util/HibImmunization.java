package edu.neu.csye6200.group1.module.util;

public class HibImmunization extends Immunization {
    private boolean skinTestResult;
    private boolean skinTestRequired;

    @Override
    public boolean isValidate() {
        return false;
    }
}
