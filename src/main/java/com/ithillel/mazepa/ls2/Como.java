package com.ithillel.mazepa.ls2;

import java.util.Scanner;

public class Como {
    static final char CHAR = 176;

    private static void printDouble(double value) {
        System.out.print(value);
        System.out.println(CHAR);
    }

    private static void printString(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        double[] coordinatesOfTheRoadOfTheGiants = {55.240833, -6.511667};
        double[] coordinatesOfClosedMcDonaldsInDnipro = {48.425505000000000, 35.024594000000000};

        printString("What coordinates do you want to see?\n'The Road Of The Giants' or 'closed McDonalds In Dnipro' ?");
//сканер десь скопіпаздив
        Scanner console = new Scanner(System.in);
        var coordinates = console.nextLine();

        if (coordinates.equals("The Road Of The Giants")) {
            for (double i : coordinatesOfTheRoadOfTheGiants) {
                printDouble(i);
            }
        } else if (coordinates.equals("closed McDonalds In Dnipro")) {
            for (double i : coordinatesOfClosedMcDonaldsInDnipro) {
                printDouble(i);
            }
        } else {
            printString("god damn, it is 404");
        }
    }
}