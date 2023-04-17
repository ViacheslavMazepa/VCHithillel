package com.ithillel.mazepa.ls14OOP2;

abstract class Employee {
    private final String name;
    private int age;
    private String title;
    private int salary;

    protected Employee(String name, int age, String title, int salary) {
        this.name = name;
        this.age = age;
        this.title = title;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public int getSalary(int bonus) {
        return salary + bonus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void whenBugInTheReleaseIsFounded();
}
