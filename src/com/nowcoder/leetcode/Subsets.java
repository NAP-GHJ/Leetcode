package com.nowcoder.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Arrays.sort(S);
        subsets(S,0,result,cur);
        System.out.println(result);
        return result;
    }

    public void subsets(int[] s,int index, List<List<Integer>> result, ArrayList<Integer> cur) {
        if(index == s.length) {
            result.add(new ArrayList<>(cur));
            return;
        }

        subsets(s,index+1,result,cur);
        cur.add(s[index]);
        subsets(s,index+1,result,cur);
        cur.remove(cur.size()-1);
    }

    public static void main(String [] args){
        new Subsets().subsets(new int [] {1,2});
    }
}
