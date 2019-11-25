package edu.neu.csye6200.group1.model.dao;


/**
 * VaricellaVaccine
 * @Param
 * id: Vaccine Id
 * name: Varicella
 * totalDose: 1
 * validMonth: 6 months
 * daysBetweenDoses: null
 * description: Other details of vaccine
 * isRequiredST: true
 */

public class VaricellaVaccine extends Vaccine {
    public VaricellaVaccine(){
        super();
        super.setIsRequiredST(true);
        super.setName("Varicella");
        super.setDescription("This is a Varicella vaccine.");
        super.setTotalDose(1);
        super.setValidMonth(6);
    }
}
