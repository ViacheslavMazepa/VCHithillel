package com.ithillel.mazepa.ls5;

public class HomeWork {
    public static void main (String[] args) {

        Dynasty Lee = new Dynasty (860, 13, 24, 46);
        Dynasty Min = new Dynasty ((int) (860 * 1.5), 9, 35, 12);

        System.out.println(Lee.totalAttack());
        System.out.println(Min.totalAttack());

        if (Lee.totalAttack() > Min.totalAttack()) {
            System.out.println("Lee Dynasty had a clear advantage");
        } else if (Lee.totalAttack() < Min.totalAttack()){
            System.out.println("Min Dynasty had a clear advantage");
        } else System.out.println("Parity ¯\\_(ツ)_/¯");
    }

    static class Dynasty {
        private int numberOfSoldier;
        private int warriorDamage;
        private int bowmanDamage;
        private int riderDamage;

        Dynasty (int numberOfSoldier, int warriorDamage, int bowmanDamage, int riderDamage) {
            this.numberOfSoldier = numberOfSoldier;
            this.warriorDamage = warriorDamage;
            this.bowmanDamage = bowmanDamage;
            this.riderDamage = riderDamage;
        }
        int totalAttack () {
            return (warriorDamage * numberOfSoldier) + (bowmanDamage * numberOfSoldier) + (riderDamage * numberOfSoldier);
        }
    }
}
