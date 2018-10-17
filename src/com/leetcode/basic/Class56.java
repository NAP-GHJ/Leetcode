package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Merge Intervals
 */

class Interval{
    int start;
    int end;
    Interval(){start = 0; end = 0;}
    Interval(int s,int e){start = s; end = e;}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("["+start+","+end+"]");
        return sb.toString();
    }
}

public class Class56 {


    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1) return intervals;

        List<Interval> result = new ArrayList<>();

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });


        Interval current = intervals.get(0);
        Interval tmp ;

        for(int i = 1; i < intervals.size(); i++){
            tmp = intervals.get(i);
            if(tmp.start <= current.end){  // Merge
                current.end = Math.max(tmp.end,current.end);
            }else{
                result.add(new Interval(current.start,current.end));
                current = tmp;
            }
        }

        result.add(current);

        //System.out.println(result);
        return result;
    }

    public static void main(String [] args){
        List<Interval> intervals = new ArrayList<>();
        Interval interval1 = new Interval(1,3);
        Interval interval2 = new Interval(2,6);
        Interval interval3 = new Interval(8,10);
        Interval interval4 = new Interval(15,18);

        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);

        new Class56().merge(intervals);
    }
}
