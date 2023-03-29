package com.ithillel.mazepa.ls11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Class {
    static ArrayList<Integer> firstSlide(){
        return new ArrayList<>();
    }
    static ArrayList<Integer> secondSlide(ArrayList<Integer> arrayList,int min, int max, int size){
        for (int i = 0; i < size; i++){
            int a =  (new Random().nextInt(((max - min) + 1) + min));
            arrayList.add(i, a);
        }
        return  arrayList;
    }
    static ArrayList<Integer> slide3 (ArrayList<Integer> arrayList){
        return new ArrayList<>(arrayList);
    }
    static HashSet<Integer> slide4 (ArrayList<Integer> arrayList){
        return new HashSet<>(arrayList);
    }
    static void slide5 (ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
    }
    static void slide6 (ArrayList<Integer> arrayList){
    }
    static int slide7 (ArrayList<Integer> arrayList){
        int a = 0;
        for(Integer i : arrayList){
            a += i;
        }
        return a;
    }
    static ArrayList<Integer> slide8 (ArrayList<Integer> arrayList){
        ArrayList<Integer> array = new ArrayList<>();
        for(Integer i : arrayList){
            if(i > 0){
                array.add(i);
            }
        }
        return array;
    }

    static boolean slide9 (ArrayList<Integer> arrayList, int num){
        return arrayList.contains(num);
    }
    static boolean slide10 (ArrayList<Integer> arrayList, int num){
        System.out.println(Collections.frequency(arrayList, num));
        return arrayList.contains(num);
    }
    static void slide11 (ArrayList<Integer> arrayList){
        Collections.reverse(arrayList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = firstSlide();
        ArrayList<Integer> arrWithValues = secondSlide(array,-10, 10, 10);
        System.out.println(arrWithValues);
        System.out.println(slide3(arrWithValues));
        System.out.println(slide4(arrWithValues));
        slide5(arrWithValues); System.out.println(arrWithValues);
        System.out.println(slide7(arrWithValues));
        System.out.println(slide8(arrWithValues));
        System.out.println(slide9(arrWithValues, 5));
        System.out.println(slide10(arrWithValues, 7));
    }
}
