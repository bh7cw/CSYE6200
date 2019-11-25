package edu.neu.csye6200.group1.module.dao;


/**
 * MMRVaccine
 * @Param
 * id: Vaccine Id
 * name: MMR
 * totalDose: 1
 * validMonth: 8 months
 * daysBetweenDoses: null
 * description: Other details of vaccine
 * isRequiredST: true
 */


public class MMRVaccine extends Vaccine {
    public MMRVaccine() {
        super();
        super.setIsRequiredST(true);
        super.setName("MMR");
        super.setDescription("This is a MMR vaccine.");
        super.setTotalDose(1);
        super.setValidMonth(8);
    }
}
