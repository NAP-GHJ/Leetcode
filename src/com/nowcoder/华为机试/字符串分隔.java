package com.nowcoder.华为机试;

import java.util.Scanner;

public class 字符串分隔 {

    public static void main(String [] args){
        String s;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            s = input.nextLine();
            int i;
            for(i = 0; i < s.length(); i++){
                System.out.print(s.charAt(i));
                if((i+1)%8 == 0) System.out.println();
            }
            if( i%8 != 0){
                while ((i)%8 != 0){
                    System.out.print('0');
                    i++;
                }
                System.out.println();
            }
        }
    }
}
