package edu.neu.csye6200.group1.module.dao;

public class Teacher extends AbstractPerson {
    private int teacherId;
    private int credits;
    private double wage;

    public Teacher() {

    }

    /**
     * csv input format:
     *  teacher firstname + teacher lastname + teacher gender + teacher credits +
     *  teacher wage + teacher registerDate
     * @param CSVString an input csv teacher from FileUtil with 6 attributes
     */
    public Teacher(String CSVString){
        String[] fileds = CSVString.split(",");
        if(fileds.length != 6) throw new IllegalArgumentException("The input CSV String for teacher must has 6 attributes: \n" +
                "teacher firstname + teacher lastname + teacher gender + teacher credits +\n" +
                " eacher wage + teacher registerDate");

        this.setFirstName(fileds[0]);
        this.setLastName(fileds[1]);
        this.setGender(fileds[2]);
        this.setCredits(FileUtil.strToInt(fileds[3]));
        this.setWage(FileUtil.strToDouble(fileds[4]));
        this.setRegisterDate(FileUtil.strToDate(fileds[5]));

    }

    public int getTeacherID() {
        return teacherId;
    }

    public void setTeacherID(int teacherID) {
        this.teacherId = teacherID;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + getTeacherID() +
                ", firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", gender=" + getGender() +
                ", credits=" + getCredits() +
                ", wage=" + getWage() +
                ", registerDate=" + getRegisterDate() +
                '}';
    }

    /**
     * csv output format:
     * teacher id + teacher firstname + teacher lastname + teacher gender + teacher credits +
     * teacher wage + teacher registerDate
     * @return
     */
    @Override
    public String toCSVString() {
        return getTeacherID() + "," +
                getFirstName() + "," +
                getLastName() + "," +
                getGender() + "," +
                getCredits() + "," +
                getWage() + "," +
                FileUtil.dateToString(getRegisterDate());
    }
}