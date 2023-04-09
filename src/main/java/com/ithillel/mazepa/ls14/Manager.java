package com.ithillel.mazepa.ls14;

public class Manager extends Employee {
    private int numberOfEmployeesInTeam;

    Manager(String name, int age, String title, int salary, int numberOfEmployeesInTeam) {
        super(name, age, title, salary);
        this.numberOfEmployeesInTeam = numberOfEmployeesInTeam;
    }

    public int getNumberOfEmployeesInTeam() {
        return numberOfEmployeesInTeam;
    }

    public void setNumberOfEmployeesInTeam(int numberOfEmployeesInTeam) {
        this.numberOfEmployeesInTeam = numberOfEmployeesInTeam;
    }

    @Override
    public void whenBugInTheReleaseIsFounded() {
        System.out.println(super.getName() + " turned gray");
    }

    @Override
    public int getSalary() {
        return super.getSalary() + numberOfEmployeesInTeam * 10;
    }

    @Override
    public int getSalary(int bonus) {
        return super.getSalary() + bonus + numberOfEmployeesInTeam * 10;
    }
}
