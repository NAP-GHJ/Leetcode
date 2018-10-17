package com.leetcode.basic;

public class Class29 {

    public int divide(int dividend, int divisor){
        if(divisor == 0) return Integer.MAX_VALUE;

        int count = 0, sum = 0;
        for( int i = 0; i < dividend; i++){
            sum += divisor;
            if(dividend >= 0){
                if(sum > dividend) break;
            }else{
                if(sum < dividend) break;
            }
            count ++;
        }
        System.out.println(count);

        double d = 1.0;
        String dd = "1.0";
        

        return count;

    }

    public static void main(String [] args){
        new Class29().divide(-10,3);
    }
}
