package com.ithillel.mazepa.ls16Exception.option1;

public class Main {
    public static void main(String[] args) {
        try {
            Hulk hulk = new Hulk();
            hulk.toBreak();
        } catch (NullPointerException e) {
            throw new MyException();
        } finally {
            System.out.println("Hulk - break");
        }
    }
}
