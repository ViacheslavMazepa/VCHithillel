package com.ithillel.mazepa.ls14;

public final class QualityAssurance extends Employee {

    private int completedStoryPointsForAMonth;

    QualityAssurance(String name, int age, String title, int salary, int completedStoryPointsForAMont) {
        super(name, age, title, salary);
        this.completedStoryPointsForAMonth = completedStoryPointsForAMont;
    }

    public int getCompletedStoryPointsForAMonth() {
        return completedStoryPointsForAMonth;
    }

    public void setCompletedStoryPointsForAMonth(int completedStoryPointsForAMonth) {
        this.completedStoryPointsForAMonth = completedStoryPointsForAMonth;
    }

    @Override
    public void whenBugInTheReleaseIsFounded() {
        System.out.println(super.getName() + " satisfied");
    }

    @Override
    public int getSalary() {
        return super.getSalary() + (int) (completedStoryPointsForAMonth * 0.5);
    }

    @Override
    public int getSalary(int bonus) {
        return super.getSalary(bonus) + (int) (completedStoryPointsForAMonth * 0.5);
    }
}
