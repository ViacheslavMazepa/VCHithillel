package com.ithillel.mazepa.ls14OOP2;

public final class Developer extends Employee {

    private int completedStoryPointsForAMonth;

    Developer(String name, int age, String title, int salary, int completedStoryPointsForAMonth) {
        super(name, age, title, salary);
        this.completedStoryPointsForAMonth = completedStoryPointsForAMonth;
    }

    public int getCompletedStoryPointsForAMonth() {
        return completedStoryPointsForAMonth;
    }

    public void setCompletedStoryPointsForAMonth(int completedStoryPointsForAMonth) {
        this.completedStoryPointsForAMonth = completedStoryPointsForAMonth;
    }

    @Override
    public void whenBugInTheReleaseIsFounded() {
        System.out.println(super.getName() + " is crying");
    }

    @Override
    public int getSalary() {
        return super.getSalary() + (int) (completedStoryPointsForAMonth * 0.5);
    }

    @Override
    public int getSalary(int bonus) {
        return super.getSalary() + bonus + (int) (completedStoryPointsForAMonth * 0.5);
    }
}
