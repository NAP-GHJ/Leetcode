package com.leetcode.basic;

public class Class37 {
    public void solveSudoku(char[][] board){
        solveSudoku(board,0,0);
    }

    public boolean solveSudoku(char [][]board,int row,int col){

        if(row == 9){
            return true;
        }
        if(board[row][col] != '.'){
            return solveSudoku(board,getNextPosition(row,col)[0],getNextPosition(row,col)[1]);
        }else{
            for(int i = 1; i<=9; i++){
                if(checkValid(board,row,col,i)){
                    board[row][col] = (char)( i+'0');
                    if(solveSudoku(board,getNextPosition(row,col)[0],getNextPosition(row,col)[1])){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
            return false;
        }

    }

    public int[] getNextPosition(int row,int col){
        if(col < 8) col++;
        else {
            row ++;
            col = 0;
        }
        return new int []{row,col};
    }

    public boolean checkValid(char[][] board,int row, int col, int target){
        for(int i = 0; i<9; i++){
            if(board[i][col] == (char)(target+'0')){
                return false;
            }
        }
        for(int i = 0; i < 9; i++){
            if(board[row][i] == (char)(target+'0')){
                return false;
            }
        }
        int startX = (row/3)*3;
        int startY = (col/3)*3;
        for(int i =0; i<3; i++){
            for (int j = 0; j<3; j++){
                if(board[startX+i][startY+j] == (char)(target+'0')){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String [] args){
        new Class37().solveSudoku(new char[][]{"..9748...".toCharArray(),"7........".toCharArray(),".2.1.9...".toCharArray(),"..7...24.".toCharArray(),".64.1.59.".toCharArray(),".98...3..".toCharArray(),"...8.3.2.".toCharArray(),"........6".toCharArray(),"...2759..".toCharArray()});
    }
}
