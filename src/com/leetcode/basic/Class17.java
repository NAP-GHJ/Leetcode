package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class Class17 {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        letterCombinations(digits,result,sb,0);
//        System.out.println(result);
        return result;
    }

    public void letterCombinations(String digits,List<String> result,StringBuilder sb,int index){
        if(digits == null || digits.length() == 0) return;
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String key = KEYS[digits.charAt(index) - '0'];
        char []keys = key.toCharArray();
        for(int i = 0; i<keys.length; i++){
            sb.append(keys[i]);
            letterCombinations(digits,result,sb,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String [] args){
        new Class17().letterCombinations("23");
    }

}
