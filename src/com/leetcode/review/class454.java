package com.leetcode.review;

import java.util.HashMap;

public class class454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                int sum = A[i]+B[j];
                map.put(A[i]+B[j],map.getOrDefault(sum,0)+1);
            }
        }

        int count = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                int sum = C[i]+D[j];
                if(map.containsKey(0-sum)) count += map.get(0-sum);
            }
        }
        return count;
    }
}
