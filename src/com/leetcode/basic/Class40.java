package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Two sum using hashmap
 */
public class Class40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates,candidates.length,target,result,sum);
        System.out.println(result);
        return result;
    }

    public void combinationSum2(int []candidates,int last,int target,List<List<Integer>> result,List<Integer> sum){
        if (target == 0){
            if(!result.contains(sum))
                result.add(new ArrayList<Integer>(sum));
            return;
        }
        if(last == 0) return;
        if(candidates[last-1] <= target){
            sum.add(candidates[last-1]);
            combinationSum2(candidates,last-1,target-candidates[last-1],result,sum);
            sum.remove(sum.size()-1);
        }
        combinationSum2(candidates,last-1,target,result,sum);
    }

    public static void main(String [] args){
        new Class40().combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }
}
