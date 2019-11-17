package edu.neu.csye6200.group1.module.extdao;

import edu.neu.csye6200.group1.module.dao.Student;

public class ExtStudent extends Student {
    private int month;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
