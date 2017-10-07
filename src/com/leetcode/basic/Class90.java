package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class90 {

    public List<List<Integer>> subsetsWithDup(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        subsets(result,subset,nums,0);
//        System.out.println(result);
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
        new Class90().subsetsWithDup(new int[]{4,4,4,1,4});
    }
}
