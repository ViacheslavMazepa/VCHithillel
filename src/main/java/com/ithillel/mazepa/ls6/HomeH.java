package com.ithillel.mazepa.ls6;

import java.util.Scanner;

public class HomeH {
    public static void main(String[] args) {

        int max = 10;
        int demand = 3;
        int random = (int) (Math.random() * (max + 1));
        System.out.println(random);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < demand; i++) {
            System.out.println( demand - i + " requests left");
            System.out.print("enter an integer [0 - 10] ");
            String num = scanner.nextLine();

            if (String.valueOf(random).equals(num)) {
                System.out.println("U are in luck John Connor");
                break;
            } else if ( i >= 2 ) {
                System.out.println("hey leather, SkyNet won");
            }
        }
    }
}
