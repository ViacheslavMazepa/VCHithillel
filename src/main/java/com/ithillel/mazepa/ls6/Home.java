package com.ithillel.mazepa.ls6;

public class Home {
    public static void main(String[] args) {

        int counter = 0;
        int id = 0;

        for ( int i = 0; counter < 100; i++) {
            id++;
            if (id % 10 == 4 || id % 10 == 9 || id / 10 == 4 || id / 10 == 9 || id / 10 == 14 || id / 10 == 19 ) {
                continue;
            }
            counter++;
            System.out.println("shuttle number: " + id);
        }
        System.out.println("total numbers = " + counter);
    }
}
