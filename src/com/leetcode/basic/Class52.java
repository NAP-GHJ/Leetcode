package com.leetcode.basic;

public class Class52 {

    public int totalNQueens(int n){
        int [] positions = new int[n];
        Integer count = 0;

        count = totalNQueens(n,positions,0);
        return count;
    }

    public int totalNQueens(int n,int []positions,int level){
        if(level == n){
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isValid(positions,level,i)){
                positions[level] = i;
                count += totalNQueens(n,positions,level+1);
            }
        }
        return count;
    }

    public boolean isValid(int [] positions,int level, int target){
        for(int i = 0; i<level; i++){
            if(positions[i] == target)
                return false;
            if(i - level == positions[i]-target || i-level == target-positions[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        new Class52().totalNQueens(8);
    }
}
