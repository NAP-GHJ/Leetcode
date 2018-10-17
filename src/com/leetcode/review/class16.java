package com.leetcode.review;

import java.util.Arrays;

public class class16 {

    public int threeSumClosest(int[] nums, int target) {
        int minA = Integer.MAX_VALUE;
        int min = 0;
        if(nums == null || nums.length <= 0) return 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int start = i+1, last = nums.length - 1;
            while (start < last){
                int dis = nums[i]+nums[start]+nums[last] - target;
                if(Math.abs(dis) < minA){
                    minA = Math.abs(dis);
                    min = nums[i]+nums[start]+nums[last];
                }
                if(dis == 0){
                    return nums[i]+nums[start]+nums[last];
                }else if(dis > 0) last --;
                else start ++;
            }
        }
        return min;
    }

    public static void main(String [] args){
        new class16().threeSumClosest(new int []{1,1,1,0},100);
    }
}
