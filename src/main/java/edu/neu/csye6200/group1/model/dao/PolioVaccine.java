package edu.neu.csye6200.group1.model.dao;


/**
 * PolioVaccine
 * @Param
 * id: Vaccine Id
 * name: Hib
 * totalDose: 3
 * validMonth: 15 months
 * daysBetweenDoses: {20,20}
 * description: Other details of vaccine
 * isRequiredST: false
 */

public class PolioVaccine extends Vaccine {
    public PolioVaccine() {
        super();
        super.setIsRequiredST(false);
        super.setName("Polio");
        super.setDescription("This is a Polio vaccine.");
        super.setTotalDose(3);
        super.setDaysBetweenDoses(new int[]{20,20});
        super.setValidMonth(15);
    }
}
