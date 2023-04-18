package com.ithillel.mazepa.ls9;

public class Main {
//    public String firstTwo(String str, int n) {
//        if(str.length() > 2)
//            return str.substring(0,2);
//        return str.substring(0,n +1 ) + str.substring(n);
//    }
    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        return sum;

    }
    public boolean double23(int[] nums) {
        if (nums.length > 1) return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3 ;
        return false;
    }
    public boolean hasBad(String str) {
        if(str.length() <= 2) return false;
        String x = "bad";
        String one = str.substring(0,3);
        if(str.length() <= 4){
            String two = str.substring(1,4);
            return x.equals(one) || x.equals(two);
        }else x.equals(one);
        return false;
    }

}
