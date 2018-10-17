package com.leetcode.review;

public class class14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0) return "";
        String sub = strs[0];
        for(int i = 1; i < strs.length; i++){

            if(sub.length() == 0) break;
            if(strs[i].startsWith(sub)) continue;
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < strs[i].length(); j++){
                if(j >= sub.length()) break;
                if(sub.charAt(j) == strs[i].charAt(j)){
                    sb.append(sub.charAt(j));
                }else break;
            }
            sub = sb.toString();
        }
        System.out.println(sub);
        return sub;
    }
}
