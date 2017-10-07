package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = 0;
        int []dp = new int[triangle.size()];

        List<Integer> current;
        for(int i = triangle.size() - 1; i>=0; i--){
            current = triangle.get(i);
            for(int j = 0; j < current.size(); j++){
                if(i == triangle.size()-1) dp[j] = current.get(j);
                else dp[j] = Math.min(current.get(j)+dp[j],current.get(j)+dp[j+1]);
            }
        }

        return dp[0];
    }

    public static void main(String [] args){
        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(6,5,7);
        List<Integer> list4 = Arrays.asList(4,1,8,3);
        List<List<Integer>> lls = Arrays.asList(list1,list2,list3,list4);
        new Class120().minimumTotal(lls);
    }

}
