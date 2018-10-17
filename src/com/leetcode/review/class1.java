package com.leetcode.review;

import java.util.HashMap;

public class class1 {
    public int [] twoSum(int [] nums,int target){
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.containsKey(target - nums[i])){
                return new int [] {set.get(target - nums[i]),i};
            }
            set.put(nums[i],i);
        }
        return null;
    }
}
