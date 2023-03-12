package com.ithillel.mazepa.ls7;

import java.util.Arrays;

public class HomeWork {
     static void randomAgeOfrArrays (int [] array, int maxAge, int minAge){
        for (int i = 0; i < array.length; i++) {
            array[i] = minAge + (int) ((Math.random() * (maxAge - minAge + 1)));
        }
    }
    static double averageAgeOfTheTeam (int [] array, int numberOfMembers){
        int age = 0;
        for (int i : array) {
            age += i;
        }
        return (double) age / numberOfMembers;
    }

    public static void main(String[] args) {
        int maxAge = 40;
        int minAge = 18;
        int membership = 25;
        int [] ageTeam1 = new int[membership];
        int [] ageTeam2 = new int[membership];

        randomAgeOfrArrays(ageTeam1, maxAge, minAge);
        randomAgeOfrArrays(ageTeam2, maxAge, minAge);

        System.out.println("the age of the members of the 1 team: " + Arrays.toString(ageTeam1));
        System.out.println("the age of the members of the 2 team: " + Arrays.toString(ageTeam2));

        System.out.println("average age of the 1 team: " + averageAgeOfTheTeam(ageTeam1, membership));
        System.out.print("average age of the 2 team: " + averageAgeOfTheTeam(ageTeam2, membership));
    }
}
