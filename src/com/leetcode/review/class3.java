package com.leetcode.review;

import java.util.HashSet;

public class class3 {

    // 方法一：HashSet
    public int lengthOfLongestSubstring(String s){
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        for(int j = 0; j < s.length();){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                count = Math.max(count,set.size());
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }

}
