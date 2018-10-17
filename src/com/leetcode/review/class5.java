package com.leetcode.review;

public class class5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len <= 1) return s;
        String result = "";
        String tmp;
        for(int i = 1; i < len; i++){
            tmp = longest(s,i);
            if(tmp.length() >= result.length()) result = tmp;
        }

        return result;
    }

    public static String longest(String s, int median){
        int left = median - 1, right = median + 1;
        while (left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left--; right++;
            }else break;
        }

        int left2 = median - 1, right2 = median;
        while (left2 >= 0 && right2 < s.length()){
            if(s.charAt(left2) == s.charAt(right2)){
                left2--; right2++;
            }else break;
        }
        String s1 = s.substring(left+1,right);
        String s2 = s.substring(left2+1,right2);
        return (s1.length() > s2.length())?s1:s2;
    }

    public static void main(String [] args){
        new class5().longestPalindrome("babad");
        new 最长回文子串().longestPalindrome("babad");
    }

    static class 最长回文子串{
        public String longestPalindrome(String s){
            int len = s.length();
            if(len <= 0) return s;
            String result = "", tmp;
            for(int i = 0; i  < len; i++){
                tmp = subString(s,i,i);
                if(tmp.length() > result.length()) result = tmp;
                tmp = subString(s,i-1,i);
                if(tmp.length() > result.length()) result = tmp;
            }
            System.out.println(result);
            return result;
        }

        public String subString(String s, int left, int right){
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    left --; right ++;
                }else break;
            }
            return s.substring(left+1,right);
        }
    }
}
