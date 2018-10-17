package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class6 {
    public String convert(String s, int numRows){

        if(numRows <= 1) return s;
        StringBuilder result = new StringBuilder();

        ArrayList<Character> [] list = (ArrayList<Character>[]) new ArrayList[numRows];
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<Character>();
        }

        for(int i = 0, j = 0; i < s.length(); i++,j++){

            if(j%(2*numRows-2) < numRows){
                list[j%(2*numRows-2)].add(s.charAt(i));
            }else {
                list[2*numRows-2-j%(2*numRows-2)].add(s.charAt(i));
            }
        }

        for(int i = 0; i < numRows; i++){
            Iterator<Character> it = list[i].iterator();
            while (it.hasNext()){
                result.append(it.next());
            }
        }

        return result.toString();

    }

    public static void main(String [] args){
        System.out.println(new Class6().convert("PAYPALISHIRING",3).equals("PAHNAPLSIIGYIR"));
    }

}
