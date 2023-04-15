package com.ithillel.mazepa.ls13;

public class TechTeam extends Employee {
    String title;
    private int salary = 0;

    public TechTeam(String name, int age, String title, int salary) {
        super(name, age);
        this.title = title;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
