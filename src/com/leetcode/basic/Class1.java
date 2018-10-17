package com.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

public class Class1 {
    public int [] twoSum(int [] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int [2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String [] args){
        int [] result = new Class1().twoSum(new int[]{2,7,11,15},9);
        System.out.println(result[0]+" "+result[1]);
    }
}
