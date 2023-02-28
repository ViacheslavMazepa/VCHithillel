package com.ithillel.mazepa.ls5;

public class Dynasty {
    private int numberOfSoldier;
    private int warriorDamage;
    private int bowmanDamage;
    private int riderDamage;

    public Dynasty(int numberOfSoldier, int warriorDamage, int bowmanDamage, int riderDamage) {
        this.numberOfSoldier = numberOfSoldier;
        this.warriorDamage = warriorDamage;
        this.bowmanDamage = bowmanDamage;
        this.riderDamage = riderDamage;
    }
    public int totalAttack () {
        return (warriorDamage * numberOfSoldier) + (bowmanDamage * numberOfSoldier) + (riderDamage * numberOfSoldier);
    }
}
