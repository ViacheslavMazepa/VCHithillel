package com.ithillel.mazepa.ls14;

public class SchoolMemders extends People {
    private int classNumber;
    private String cassLeter;

    SchoolMemders(int classNumber) {
        this.classNumber = classNumber;
    }

    SchoolMemders(int classNumber, String cassLeter) {
        this(classNumber);
        this.cassLeter = cassLeter;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getCassLeter() {
        return cassLeter;
    }

    public void setCassLeter(String cassLeter) {
        this.cassLeter = cassLeter;
    }

    public void playSnejky() {
        System.out.println("cool winter ");
    }

    @Override
    public void breathe() {

    }
}
