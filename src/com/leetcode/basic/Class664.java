package com.leetcode.basic;

/**
 * Stange Printer
 */

public class Class664 {
    public static void main(String [] args){
        System.out.println(strangePrinter("aabbcbaab"));
    }

    public static int strangePrinter(String s) {
        int n=s.length();
        int[][] f=new int[n][n];
        for (int i=n-1;i>=0;i--)
            for (int j=i;j<n;j++)
            {
                f[i][j]=(i==j)?1:1+f[i+1][j];
                for (int k=i+1;k<=j;k++)
                    if (s.charAt(k)==s.charAt(i)) f[i][j]=Math.min(f[i][j],f[i+1][k-1]+f[k][j]);
            }
        return (n==0?0:f[0][n-1]);
    }
}
