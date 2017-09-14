package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class77 {
    public List<List<Integer>> combine(int n, int k){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        combine(n,k,combination,result);

        System.out.println(result);
        return result;
    }

    public void combine(int n,int k, List<Integer> combination, List<List<Integer>> result){
        if(k == 0){
            List<Integer> tmp = new ArrayList<>(combination);
            result.add(tmp);
            return;
        }
        if(n < k) return;
        combination.add(n);
        combine(n-1, k-1,combination,result);

        combination.remove((Integer)n);
        combine(n-1,k,combination,result);
    }

    public static void main(String [] args){
        new Class77().combine(5,3);
    }
}
