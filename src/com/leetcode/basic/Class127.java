package com.leetcode.basic;

import java.util.Arrays;
import java.util.List;

public class Class127 {
    public boolean wordBreak(String s, List<String> wordDict){
        boolean [][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                dp[i][j] = false;
            }
        }
        //Basic
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = wordDict.contains(String.valueOf(s.charAt(i)));
        }

        for(int i = s.length()-2; i >=0; i--){
            for(int j = i+1; j<s.length(); j++){
                boolean flag = false;
                for(int k = 0; k < j-i; k++){
                    flag = flag||wordDict.contains(s.substring(i,j+1)) || (dp[i][i+k] && dp[i+k+1][j]);
                }
                dp[i][j] = flag;
            }
        }

//        for(int i = 0; i < s.length(); i++){
//            for (int j= 0; j<s.length(); j++){
//                System.out.print(dp[i][j]+" \t");
//            }
//            System.out.println();
//        }
        return dp[0][s.length()-1];
    }

    public static void main(String []args){
        new Class127().wordBreak("abcd", Arrays.asList(new String []{"a","abc","b","cd"}));
    }
}
