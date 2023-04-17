package com.ithillel.mazepa.ls13OOP1;

class Employee {
    protected String name;
    public int age = 0;

    protected Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
}
