package edu.neu.csye6200.group1.module.util;

/**
 * HBVaccine
 * @Param
 * id: Vaccine Id
 * name: HB
 * totalDose: 3
 * validMonth: 16 months
 * daysBetweenDoses: {30, 35}
 * description: Other details of vaccine
 * isRequiredST: true
 */


public class HBVaccine extends Vaccine {
    public HBVaccine() {
        super();
        super.setIsRequiredST(true);
        super.setName("HB");
        super.setDescription("This is a HB vaccine.");
        super.setDaysBetweenDoses(new int[]{30,35});
        super.setTotalDose(3);
        super.setValidMonth(16);
    }
}
