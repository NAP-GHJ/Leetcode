package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class Class57 {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval){

        if(intervals == null) return null;
        if(intervals.size() <= 0) {
            intervals.add(newInterval);
            return intervals;
        }

        List<Interval> result = new ArrayList<>();

        Interval current;
        boolean flag = false;  // 标志位：newInterval是否被合并过
        boolean stop = false;  // 标志位：不需要继续合并

        for(int i  = 0; i < intervals.size(); i++) {

            if(stop){
                result.add(intervals.get(i));
                continue;
            }

            current = intervals.get(i);

            //System.out.println(newInterval+" "+current);

            if(flag){

                assert current.start > newInterval.start;
                if(current.start > newInterval.end){
                    // 不需要继续合并
                    result.add(newInterval);
                    result.add(new Interval(current.start,current.end));
                    stop = true;
                }else {
                    newInterval.end = Math.max(newInterval.end,current.end);
                }
                continue;
            }

            // current 完全包含 newInterval
            if(current.start <= newInterval.start && current.end >= newInterval.end){
                newInterval.start = current.start;
                newInterval.end = current.end;
                flag = true;
            } else if(current.start >= newInterval.start && current.end <= newInterval.end){
                // current 完全被包含于 newInterval
                // Do nothing
                flag = true;
            } else if(current.end < newInterval.start){
                // current < newInterval
               result.add(new Interval(current.start,current.end));
            } else if(current.start > newInterval.end){
                // current > newInterval
                result.add(newInterval);
                result.add(current);
                stop = true;
            } else {
                // 交叉的情况
                newInterval.start = Math.min(current.start,newInterval.start);
                newInterval.end = Math.max(current.end,newInterval.end);
                flag = true;
            }
        }

        System.out.println(result);

        return result;
    }

    public static void main(String [] args){
        List<Interval> intervals = new ArrayList<>();
        Interval interval1 = new Interval(1,5);
//        Interval interval2 = new Interval(3,5);
//        Interval interval3 = new Interval(6,7);
//        Interval interval4 = new Interval(8,10);
//        Interval interval5 = new Interval(12,16);

        intervals.add(interval1);
//        intervals.add(interval2);
//        intervals.add(interval3);
//        intervals.add(interval4);
//        intervals.add(interval5);

        new Class57().insert(intervals,new Interval(2,3));
    }
}
