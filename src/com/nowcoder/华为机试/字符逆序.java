package com.nowcoder.华为机试;

import java.util.Scanner;

public class 字符逆序 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int i = 0, j = s.length()-1;
        char [] array = s.toCharArray();
        char c;
        while (j >= i){
            c = array[i];
            array[i] = array[j];
            array[j] = c;
            j --; i++;
        }

        System.out.println( String.valueOf(array));
    }
}
