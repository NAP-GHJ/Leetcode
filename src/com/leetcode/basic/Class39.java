package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        Arrays.sort(candidates);

        combinationSum(candidates,candidates.length,target,sum,result);
        return result;
    }

    public void combinationSum(int []candidates,int last,int target,List<Integer> sum,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(sum));
            return;
        }
        if(last == 0) return;

        if(candidates[last-1] <= target){
            sum.add(candidates[last-1]);
            combinationSum(candidates,last,target - candidates[last-1],sum,result);
            sum.remove(sum.size()-1);
        }
        combinationSum(candidates,last-1,target,sum,result);

    }

    public static void main(String [] args){
        new Class39().combinationSum(new int[]{2,3,4,7},7);
    }

}
