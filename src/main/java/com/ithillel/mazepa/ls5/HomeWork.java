package com.ithillel.mazepa.ls5;

public class HomeWork {
    public static void main(String[] args) {

        Dynasty Lee = new Dynasty(860,13,24,46);
        Dynasty Min = new Dynasty((int) (860 * 1.5), 9, 35, 12);

        System.out.println(Lee.totalAttack());
        System.out.println(Min.totalAttack());

        if (Lee.totalAttack() > Min.totalAttack()){
            System.out.println("The Li Dynasty wins the battle");
        } else if (Lee.totalAttack() < Min.totalAttack()){
            System.out.println("The Min Dynasty wins the battle");
        } else System.out.println("Parity ¯\\_(ツ)_/¯");
    }
}
