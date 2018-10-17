package com.leetcode.basic;

public class Class45跳跃游戏 {
    public static int jump(int [] nums){
        if(nums == null || nums.length <= 1) return 0;

        int step = 0;
        int curMax = 0;
        int nextMax = 0;
        int i = 0;

        while(true){

            while( i <= curMax){
                nextMax = Math.max(nextMax, i+nums[i]);
                i++;
            }
            // 需要往前跳一步
            step ++;
            if(nextMax == curMax) return 0;
            else if(nextMax >= nums.length-1) return step;
            curMax = nextMax;

        }

    }

    public static void main(String [] args){
        int [] nums = new int []{2,3,1,1,4};
        int result = jump(nums);
        System.out.print(result);
    }

}
