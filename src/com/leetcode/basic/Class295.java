package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

class MedianFinder {

    List<Integer> list ;

    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    // 二分插入
    public void addNum(int num) {
        if(list.size() == 0) {
            list.add(num);
            return;
        }
        int begin = 0;
        int end = list.size()-1;
        int median = 0;

        while (end >= begin){
            median = (begin + end)/2;

            if(list.get(median) <= num) begin = median + 1;
            if(list.get(median) > num) end = median - 1;
        }
        list.add(begin,num);
    }

    public double findMedian() {
        if(list.isEmpty()) return 0.0;

        int size = list.size();
        if(size % 2 == 0){
            return ((double)list.get(size/2)+list.get(size/2-1))/2;
        }else{
            return list.get(size/2);
        }
    }
}

public class Class295{
    public static void main(String [] args){
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        //mf.addNum(1);
        System.out.println(mf.findMedian());
    }
}