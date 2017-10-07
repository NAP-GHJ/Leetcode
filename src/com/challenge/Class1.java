package com.challenge;

import java.util.Scanner;

/**
 * 3n+1
 */

public class Class1 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i,j,max,start,end;
        while (input.hasNext()){
            i = input.nextInt();
            j = input.nextInt();
            max = 0;
            if(i<=j) {
                start = i;
                end = j;
            }else{
                start = j;
                end = i;
            }
            for(int k = start; k <= end; k++){
                int tmp = k,len = 1;
                while (tmp != 1){
                    if(tmp%2 == 0) tmp /= 2;
                    else tmp = tmp * 3+1;
                    len ++;
                }
                if(len > max ) max = len;
            }
            System.out.println(i+" "+j+" "+max);
        }
    }

}
