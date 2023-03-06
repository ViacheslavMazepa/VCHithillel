package com.ithillel.mazepa.ls6;

public class Home {
    public static void main(String[] args) {

        int counter = 1;

        for ( ; counter < 100; counter++) {
            if (counter % 10 == 4 || counter % 10 == 9 || counter / 10 == 4 || counter / 10 == 9) {
                continue;
            }
            System.out.println("shuttle number: " + counter);
            counter++;
        }

        System.out.println();
        System.out.println("total numbers = " + counter);
    }
}
