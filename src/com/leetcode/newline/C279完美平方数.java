package com.leetcode.newline;

public class C279完美平方数 {
    public static int numSquares(int n) {
        int max = maxNum(n);

        System.out.println(max);
        // dp[i][j] 表示在前i个平方数表示j的形式下最少个数
        int [][] dp = new int [max+1][n+1];

        //
        dp[1][1] = 1;
        for(int i = 2; i <= max; i++){
            dp[i][1] = 1;
        }

        for(int i = 1; i <= n; i++){
            dp[1][i] = i;
        }

        for(int i = 2; i <= max; i++){
            for(int j = 2; j <= n; j++){

                dp[i][j] = dp[i-1][j];
//                System.out.println(dp[i][j]);
                if(j >= i*i){
                    if(dp[i][j - i*i] != -1)
                        dp[i][j] = Math.min(dp[i][j-i*i]+1,dp[i][j]);
                }
            }
        }

//        for(int i = 1; i <= max; i ++){
//            for(int j = 1; j <= n; j++){
//                System.out.print(dp[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println(dp[max][n]);
        return dp[max][n];
    }

    public static int maxNum(int n){
        double d = (double) n;
        double max = Math.pow(d,0.5);
        return (int)max;
    }

    public static void main(String [] args){
        numSquares(7);
    }
}
