package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class Class22 {
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('(');

        generateParenthesis(n,1,0,sb,result);
        return result;
    }

    public void generateParenthesis(int n,int left,int right,StringBuilder sb, List<String> result){

        if(right == n){
            result.add(sb.toString());
            return;
        }

        if(left < n) {
            sb.append('(');
            generateParenthesis(n, left + 1, right, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right < left){
            sb.append(')');
            generateParenthesis(n,left,right+1,sb,result);
            sb.deleteCharAt(sb.length()-1);

        }

    }

    public static void main(String [] args){
        new Class22().generateParenthesis(3);
    }

}
