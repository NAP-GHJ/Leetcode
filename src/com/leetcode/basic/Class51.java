package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO
public class Class51 {
    static int count = 0;

    public List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<List<String>>();
        int [] places = new int [n];
        for(int i = 0; i < n; i++){
            places [i] = -1;
        }

        solveNQueens(result,places,n,0);

        return result;
    }

    public void solveNQueens(List<List<String>> result, int [] places, int n, int level){
        if(level == n){
            result.add( generateResult(places));
            return;
        }
        for(int i = 0; i < n; i++){

            if(checkValid(places,level,i)){

                places[level] = i;

                solveNQueens(result,places,n, level + 1);

                // trace back is unneeded since we use "level == n" as the end condition
                // level --;
            }
        }
    }

    public boolean checkValid(int [] places, int level, int target){
        for(int i = 0; i < level; i++){
            // same column
            if(places[i] == target) return false;

            if(level - i == target - places[i] || level - i == places[i] - target){
                return false;
            }
        }
        return true;
    }

    public List<String> generateResult(int [] places){
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < places.length; i++){
            sb = new StringBuilder();
            for(int j = 0; j < places.length; j++){
                if(j != places[i]){
                    sb.append('.');
                }else{
                    sb.append('Q');
                }
            }
            result.add(sb.toString());
        }

        //System.out.println("The "+(++count) +" possible solution ");
        //Iterator<String> it = result.iterator();
        //while(it.hasNext()){
        //    System.out.println(it.next());
        //}
        return result;
    }

    public static void main(String [] args){
        new Class51().solveNQueens(8);
    }
}
