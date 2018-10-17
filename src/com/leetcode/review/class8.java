package com.leetcode.review;

public class class8 {
    public int myAtoi(String str) {
        char[] arr = str.toCharArray();
        boolean flag = true;
        int count = 0,space = 0;
        int sum = 0;

        int i = 0;
        for(; i < arr.length; i++){
            if(arr[i] == ' ') {
                continue;
            }else break;
        }

        for(; i < arr.length; i++){

            if(arr[i] == '-'){
                if(count == 1) break;
                flag = false;
                count ++;
                continue;
            }

            if(arr[i] == '+') {
                if(count == 1) break;
                count ++;
                continue;
            }

            if(arr[i] >= '0' && arr[i] <= '9'){

                // 越界
                if(sum > 214748364){
                    return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }

                // 最大值越界
                if(sum == 214748364 && flag && arr[i] >= '7'){
                    return Integer.MAX_VALUE;
                }

                // 最小值越界
                if(sum == 214748364 && !flag && arr[i] >= '8'){
                    return Integer.MIN_VALUE;
                }

                // 计算当前值
                sum = sum*10 + arr[i] - '0';
            }else break;
        }
        return flag?sum:-sum;
    }

    public static void main(String [] args){
        System.out.println(new class8().myAtoi("  +0 123"));
    }
}
