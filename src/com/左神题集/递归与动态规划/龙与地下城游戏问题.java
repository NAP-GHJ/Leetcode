package com.左神题集.递归与动态规划;

import java.util.Scanner;

public class 龙与地下城游戏问题 {
    public static int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 0;

        int len1 = dungeon.length, len2 = dungeon[0].length;

        // dp[i][j] 表示到位置i,j的时候至少需要满足的条件
        int [][] dp = new int [len1][len2];
        if(dungeon[len1-1][len2-1] >= 0) dp[len1-1][len2-1] = 1;
        else dp[len1 - 1][len2 - 1] = 1-dungeon[len1-1][len2-1];

        // 最后一列
        for(int i = len1-2; i >= 0; i--){
            dp[i][len2-1] = Math.max(1,dp[i+1][len2-1] - dungeon[i][len2-1]);
        }

        // 最后一行
        for(int i = len2-2; i >=0 ; i--){
            dp[len1-1][i] = Math.max(1,dp[len1-1][i+1] - dungeon[len1-1][i]);
        }

        for(int i = len1-2; i >= 0; i--){
            for(int j = len2-2; j >= 0; j--){
                int need = Math.min(dp[i][j+1],dp[i+1][j]);
                dp[i][j] = Math.max(1,need - dungeon[i][j]);
            }
        }


//        for(int i = 0; i < len1; i++){
//            for(int j = 0; j < len2; j++){
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(dp[0][0]);

        return dp[0][0];
    }

    public static void main(String [] args){
        int m ,n ;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        int [][] arr = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        calculateMinimumHP(arr);
    }
}
