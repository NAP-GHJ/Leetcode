package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class Class78 {
    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsets(result,subset,nums,0);
        System.out.println(result);
        return result;
    }

    public void subsets(List<List<Integer>> result, List<Integer> subset,int [] nums,int index){
        if(index == nums.length){
            if(result.contains(subset)) return;
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        subsets(result,subset,nums,index+1);
        subset.remove(subset.size()-1);

        subsets(result,subset,nums,index+1);
    }

    public static void main(String []args){
        new Class78().subsets(new int[]{1,2,2});
    }
}
