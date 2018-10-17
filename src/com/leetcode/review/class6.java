package com.leetcode.review;

public class class6 {
    public String convert(String s, int numRows) {

        if(numRows <= 1) return s;
        StringBuilder sb = new StringBuilder();
        int cycle = numRows * 2 -2;
        for(int i = 0 ; i < numRows; i++){
            int start = i;
            for(int j = 0; start + j*cycle < s.length(); j++){
                sb.append(s.charAt(start+j*cycle));

                int start1 = cycle - start;
                if(start != (numRows-1) && start != 0 && start1 + j*cycle < s.length()){
                    sb.append(s.charAt(start1+j*cycle));
                }
            }
            //System.out.println(sb.toString());

        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String [] args){
        new class6().convert("A",1);
    }
}
