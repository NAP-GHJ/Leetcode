package com.leetcode.basic;

public class Class72 {
    public int minDistance(String word1, String word2) {
        int [][] dp = new int [word1.length()+1][word2.length()+1];
        for(int i = 0; i<word1.length()+1;i++){
            for(int j = 0; j<word2.length()+1; j++){
                dp[i][j] = -1;
            }
        }
        minDistance(word1,word2,0,0,dp);
        System.out.println(dp[0][0]);
        return dp[0][0];
    }

    public int minDistance(String word1,String word2,int index1,int index2,int[][] dp){
        if(index1 == word1.length()){
            return dp[index1][index2] = word2.length() - index2;
        }
        else if(index2 == word2.length()){
             return dp[index1][index2] = word1.length() - index1;
        }
        else if(word1.charAt(index1) == word2.charAt(index2)){
            if(dp[index1+1][index2+1] != -1){}
            else{
                dp[index1+1][index2+1] = minDistance(word1,word2,index1+1,index2+1,dp);
            }
            dp[index1][index2] = dp[index1+1][index2+1];
        }else{
            //Delete
            if(dp[index1+1][index2] == -1)
                dp[index1+1][index2] = minDistance(word1,word2,index1+1,index2,dp);
            int d1 = dp[index1+1][index2];

            if(dp[index1][index2+1] == -1)
                dp[index1][index2+1] = minDistance(word1,word2,index1,index2+1,dp);
            int d2 = dp[index1][index2+1];

            //Replace

            if(dp[index1+1][index2+1] == -1)
                dp[index1+1][index2+1] = minDistance(word1,word2,index1+1,index2+1,dp);
            int d3 = dp[index1+1][index2+1];
            //Insert same as delete

            dp[index1][index2] = Math.min(Math.min(d1,d2),d3) + 1;
        }

        return dp[index1][index2];
    }

    public static void main(String [] args){
        new Class72().minDistance("a","ab");
    }
}
