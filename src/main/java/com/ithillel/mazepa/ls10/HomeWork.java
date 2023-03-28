package com.ithillel.mazepa.ls10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class HomeWork {

    static ArrayList<Integer> firstSlide(){
        return new ArrayList<>();
    }

    static ArrayList<Integer> secondSlide(ArrayList<Integer> arrayList,int min, int max, int size){
        for (int i = 0; i < size; i++){
            int a = (int) (Math.random() * (max - min +1) + min);
            arrayList.add(i,a);
        }
        return  arrayList;
    }

    static ArrayList<Integer> thirdSlide(ArrayList<Integer> arrayList){
        return (ArrayList<Integer>) arrayList.clone();
    }

    static HashSet<Integer> fourthSlide(ArrayList<Integer> arrayList){
        return new HashSet<>(arrayList);
    }

    static ArrayList<Integer> fifthSlide(ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        Collections.sort(clone);
        return clone;
    }

    static void sixthSlide(ArrayList<Integer> arrayList){
        System.out.println(Collections.max(arrayList) + " max " + Collections.min(arrayList) + " min");
    }

    static int seventhSlide(ArrayList<Integer> arrayList){
        int summ = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            summ += arrayList.get(i);
        }
        return summ;
    }

    static ArrayList<Integer> eightSlide(ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        Iterator<Integer> itr = clone.iterator();
        while (itr.hasNext()){
            if(itr.next() < 0)
                itr.remove();
        }
        return clone;
    }

    static boolean ninthSlide(ArrayList<Integer> arrayList){
        Iterator<Integer> itr = arrayList.iterator();
        return itr.hasNext();
    }

    static Map<Integer,Integer> tenthSlide (ArrayList<Integer> arrayList){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int element : arrayList) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;
    }

    static void eleventhSlide (ArrayList<Integer> arrayList){
        Collections.reverse(arrayList);
    }

    static void twelfthSlide (ArrayList<Integer> arrayList){
        int a =  arrayList.get(0);
        arrayList.set(0, arrayList.get(arrayList.size() -1));
        arrayList.set(arrayList.size() -1, a);
    }

    static int thirteenthSlide (ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        clone.remove(Collections.max(clone));
        return Collections.max(clone);
    }

    static boolean fourteenthSlide (ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        Collections.reverse(clone);
        return arrayList.equals(clone);
    }

    static LinkedList<Integer> fifteenthSlide(int size){
        LinkedList<Integer> arr = new  LinkedList<>();
        for (int i = 0; i < size; i++){
            int a = (int) (Math.random() * size);
            arr.add(i,a);
        }
        return  arr;
    }

    static void getSamElements (ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            int a = (int) (Math.random() * arrayList.size());
            arrayList.get(a);
        }
        System.out.println("ready");
    }

    static void getSamElements (LinkedList<Integer> linkedList){
        for (int i = 0; i < linkedList.size(); i++) {
            int a = (int) (Math.random() * linkedList.size());
            linkedList.get(a);
        }
        System.out.println("ready");
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = firstSlide();
        ArrayList<Integer> arrWithValues = secondSlide(array,-10, 10, 10);
        ArrayList<Integer> arrCopy = thirdSlide(arrWithValues);
        HashSet<Integer> arrSet = fourthSlide(arrWithValues);
        ArrayList<Integer> sortedArray = fifthSlide(arrWithValues);
        sixthSlide(arrWithValues);
        int summOfArray = seventhSlide(arrWithValues);
        ArrayList<Integer> arrPositiveOnly = eightSlide(arrWithValues);
        ninthSlide(arrWithValues);
        tenthSlide(arrWithValues);
        eleventhSlide(arrCopy);
        twelfthSlide(arrCopy);
        thirteenthSlide(arrWithValues);
        fourteenthSlide(arrWithValues);
        //15 slide create 2 lists + 2 get elements
        ArrayList<Integer> array2 = firstSlide();
        ArrayList<Integer> bigArray = secondSlide(array2,0,1000000,1000000);
        LinkedList<Integer> bigLinked = fifteenthSlide(1000000);
        getSamElements(bigArray);
        getSamElements(bigLinked);
    }
}
