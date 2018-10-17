package com.leetcode.basic;

public class Class53 {
    public int maxSubArray(int [] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];
            if(sum >= max) max = sum;
            if(sum < 0) sum = 0;
        }

        return max;
    }

    public static void main(String [] args){
        int [] array = new int []{-2,1,-3,4,-1,2,1,-5,4};
        int max = new Class53().maxSubArray(array);
        System.out.println(max);
    }

}
