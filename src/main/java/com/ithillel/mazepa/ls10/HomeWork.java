package com.ithillel.mazepa.ls10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

public class HomeWork {
//1
    static ArrayList<Integer> createCollection(){
        out.println("Collection is created");
        return new ArrayList<>();
    }
//2
    static ArrayList<Integer> fillRandomValuesToCollection(ArrayList<Integer> arrayList, int min, int max, int size){
        int diff = max - min;
        for (int i = 0; i < size; i++){

            arrayList.add(i, new Random().nextInt(diff + 1) + min);
        }
        //out.println("Fill in to collection: " + arrayList);
        return arrayList;
    }
//3
    static ArrayList<Integer> cloneCollection(ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = (ArrayList<Integer>) arrayList.clone();
        out.println("Cloned collection: " + clone);
        return clone;
    }
//4
    static HashSet<Integer> cloneCollectionWithUniqueValues(ArrayList<Integer> arrayList){
        HashSet<Integer> newHashSet = new HashSet<>(arrayList);
        out.println("Unique values: " + newHashSet);
        return new HashSet<>(arrayList);
    }
//5
    static void sortCollection(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        out.println("Collection is sorted: " + arrayList);
    }
//6
    static void maxMinFromCollection(ArrayList<Integer> arrayList){
        out.println("Min: " + Collections.min(arrayList) + ", Max: "+ Collections.max(arrayList));
    }
//7
    static void sumOfCollection(ArrayList<Integer> arrayList){
        int summ = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            summ += arrayList.get(i);
        }
        out.println("Sum of the elements: " + summ);
    }
//8
    static ArrayList<Integer> onlyPositive(ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        Iterator<Integer> itr = clone.iterator();
        while (itr.hasNext()){
            if(itr.next() < 0)
                itr.remove();
        }
        out.println("Positive value from collection: " + clone);
        return clone;
    }
//9
    static boolean containsNumber(ArrayList<Integer> arrayList, int num){
        out.printf("%s is present: %s", num, arrayList.contains(num));
        out.println();
        return arrayList.contains(num);
    }
//10
    static void countNumber (ArrayList<Integer> arrayList, int num){
        out.printf("%s contains %s %s time(s)", arrayList, num, Collections.frequency(arrayList, num));
        out.println();
    }
//11
    static void reversCollection(ArrayList<Integer> arrayList){
        Collections.reverse(arrayList);
        out.println("Is reversed: " + arrayList);
    }
//12
    static void swapFirstAndLast (ArrayList<Integer> arrayList){
        Collections.swap(arrayList, 0,arrayList.size() -1);
        out.println("Swap first and last: " + arrayList);
    }

    static void findSecondLargest (ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        clone.remove(Collections.max(clone));
        out.println("Second largest number: " + Collections.max(clone));
    }

    static void isPalindrome (ArrayList<Integer> arrayList){
        ArrayList<Integer> clone = new ArrayList<>(arrayList);
        Collections.reverse(clone);
        out.println("Is palindrome: " + arrayList.equals(clone));
    }

    static LinkedList<Integer> createBigLinkedList(int size){
        LinkedList<Integer> arr = new  LinkedList<>();
        for (int i = 0; i < size; i++){
            int a = (int) (Math.random() * size);
            arr.add(i,a);
        }
        return  arr;
    }

    static void getSamElements (ArrayList<Integer> arrayList){
        out.print("(ArrayList) start in ");
        out.println(currentTimeMillis());
        for (int i = 0; i < arrayList.size(); i++) {
            int a = (int) (Math.random() * arrayList.size());
            arrayList.get(a);
        }

        out.print("ready in ");
        out.println(currentTimeMillis());
    }

    static void getSamElements (LinkedList<Integer> linkedList){
        out.println("(LinkedList) start in " + currentTimeMillis());
        for (int i = 0; i < linkedList.size(); i++) {
            int a = (int) (Math.random() * linkedList.size());
            linkedList.get(a);
        }
        out.println("ready in" + currentTimeMillis());
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = createCollection();
        fillRandomValuesToCollection(array,-10, 10, 10);
        ArrayList<Integer> arrCopy = cloneCollection(array);
        HashSet<Integer> arrSet = cloneCollectionWithUniqueValues(array);
        sortCollection(arrCopy);
        maxMinFromCollection(array);
        sumOfCollection(array);
        onlyPositive(array);
        containsNumber(array,-1);
        countNumber(array, 5);
        reversCollection(array);
        swapFirstAndLast(array);
        findSecondLargest(array);
        isPalindrome(array);

        ArrayList<Integer> array2 = createCollection();
        ArrayList<Integer> bigArray = fillRandomValuesToCollection(array2,0,1000000,1000000);
        LinkedList<Integer> bigLinked = createBigLinkedList(1000000);
        getSamElements(bigArray);
        // execution of the method with a ArrayList = 0.017s
        getSamElements(bigLinked);
        // execution of the method with a LinkedList = 8m 30.117s
    }
}
