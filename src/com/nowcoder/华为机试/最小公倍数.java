package com.nowcoder.华为机试;


import java.util.Scanner;

public class 最小公倍数 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),b = input.nextInt();
        if(a >= b) System.out.println(a*b/gcd(a,b));
        else System.out.println(a*b/gcd(b,a));
    }

    public static int gcd(int a, int b){
        if(a % b == 0) return b;
        return gcd(b,a - (a/b)*b);
    }

}
