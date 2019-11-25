package edu.neu.csye6200.group1.model.dao;

/**
 * HibVaccine
 * @Param
 * id: Vaccine Id
 * name: Hib
 * totalDose: 2
 * validMonth: 12 months
 * daysBetweenDoses: 15
 * description: Other details of vaccine
 * isRequiredST: false
 */

public class HibVaccine extends Vaccine {
    public HibVaccine() {
        super();
        super.setIsRequiredST(false);
        super.setName("Hib");
        super.setDescription("This is a Hib vaccine.");
        super.setTotalDose(2);
        super.setDaysBetweenDoses(new int[]{15});
        super.setValidMonth(12);
    }
}
