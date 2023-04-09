package com.ithillel.mazepa.ls7;

import java.util.Arrays;
import java.util.Collections;

public abstract class CW1 {

    public abstract void coll ();

    public static void main(String[] args) {

//     int [] array = new int [10];
//     for (int i = 0; i < array.length; i++ ) {
//         array[i] = (int) (Math.random() * 11);
//         if(i < array.length - 1){
//             System.out.print(i + ", ");
//         } else System.out.print(i);
//     }
//        System.out.println();
//        System.out.println();


//     int [] arr2 = {1, 44, 99, 44, 99, 33, 55, -2, 99, 10};
//     int killerId;
//     int chance = -1;
//        for (int i = 0; i < arr2.length; i++) {
//            if (chance < arr2[i]){
//                chance = Math.max(chance, arr2[i]);
//            }
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] == chance){
//                killerId = i;
//                System.out.println("killer id = " + killerId +" na "+ chance);
//            }
//        }

//        int[] team = new int[10];
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(team));
//
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < team.length; i ++) {
//            if(i % 2 !=0){
//                sum1 += team[i];
//            } else             sum2 += team[i];
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);
//
//        if (sum1 > sum2){
//            System.out.println("main have more" + (sum1 - sum2));
//        } else if (sum1 < sum2) {
//            System.out.println("reserve have more" + (sum2 - sum1));
//        } else System.out.println("draw!");

        Integer [] array = {5,2,6,1,-20,99,0,-99};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        Integer[] array2 = Arrays.copyOf(array, 9);
        System.out.println(Arrays.toString(array2));
    }
}
