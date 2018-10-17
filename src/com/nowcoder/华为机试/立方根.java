package com.nowcoder.华为机试;

import java.util.Scanner;

public class 立方根 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println(getCubeRoot(input.nextDouble()));
    }

    public static double getCubeRoot(double input){
        return Math.pow(input,(double) 1/3);
    }
}
