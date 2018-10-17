package com.leetcode.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class class18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new LinkedList<>();
        if(nums.length <= 3) return list;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                List<List<Integer>> cur = threeSum(nums,i+1,target-nums[i],nums[i]);
                for(List<Integer> element : cur){

                    list.add(element);
                }
            }
        }
        return list;
    }

    public static List<List<Integer>> threeSum(int [] nums, int start, int target,int first){
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(start+" "+target);
        for(int i = start; i < nums.length - 2; i++){
            if(i == start || nums[i] != nums[i-1]){
                int left = i+1, right = nums.length - 1;
                while (left < right){
                    if(nums[left] + nums[right] + nums[i] == target){
                        list.add(Arrays.asList(first,nums[i],nums[left],nums[right]));
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;right--;
                    }else if(nums[left] + nums[right] + nums[i] < target) left++;
                    else right--;
                }
            }
        }
        return list;
    }

    public static void main(String [] args){
        new class18().fourSum(new int []{1,1,1,1,1},4);
    }

}
