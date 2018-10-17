package com.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

public class Class600 {

    public int findIntegers(int num){
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        if(num < 3) return num+1;
        for(int i = 3; i <= num; i++){
            System.out.println("*** "+i+" "+Integer.toBinaryString(i));
            if(Integer.toBinaryString(i).charAt(1) == '1'){
                count++;
                System.out.println(i+" "+Integer.toBinaryString(i));
                map.put(i,i);
                continue;
            }
            if(map.containsKey(i<<2)){
                System.out.println(i+" "+Integer.toBinaryString(i));
                map.put(i,i);count++;
            }
        }
        System.out.println(num+1-count);
        return num - count+1;
    }

    public static void main(String [] args){
        System.out.println(11>>2);
        new Class600().findIntegers(11);
    }
}
