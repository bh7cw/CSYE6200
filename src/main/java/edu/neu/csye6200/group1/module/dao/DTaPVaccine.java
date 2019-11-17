package edu.neu.csye6200.group1.module.dao;

/**
 * DTaPVaccine
 * @Param
 * id: Vaccine Id
 * name: DTaP
 * totalDose: 4
 * validMonth: 24 months
 * daysBetweenDoses: {17, 17, 25, 25}
 * description: Other details of vaccine
 * isRequiredST: false
 */


public class DTaPVaccine extends Vaccine {
    public DTaPVaccine() {
        super();
        super.setIsRequiredST(false);
        super.setName("DTaP");
        super.setDescription("This is a DPaP vaccine.");
        super.setTotalDose(4);
        super.setValidMonth(24);
        super.setDaysBetweenDoses(new int[]{17, 17, 25, 25});
    }
}
