package edu.neu.csye6200.group1.model.dao;

public class GroupInfo {
    private int groupInfoId;
    private int teacherId;
    private int low;
    private int high;

    public int getGroupInfoId() {
        return groupInfoId;
    }

    public void setGroupInfoId(int groupInfoId) {
        this.groupInfoId = groupInfoId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}