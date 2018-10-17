package com.nowcoder;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {
    class Point{
        int x;
        int y;
        Point(){ x = y = 0;}
        Point(int x, int y){this.x = x; this.y = y;}
    }

    class A{
        int x;
        int y;

        A(){}

        A(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            A a = (A) o;

            return a.x * this.y == a.y * this.x;

        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return 0;
        }

    }
    public int maxPoints(Point[] points) {

        if(points.length <= 2) return points.length;

        Map<A,Integer> map = new HashMap<>();
        A a = null;
        int max = Integer.MIN_VALUE;
        int reward = 0;

        for(int i = 0; i < points.length - 1; i++){

            for(int j = i+1; j < points.length; j++){
                if(points[j].y == points[i].y && points[j].x == points[i].x)
                    reward++;
                else{
                    a = new A(points[j].y - points[i].y,points[j].x-points[i].x);
                    if(map.containsKey(a)){
                        map.put(a,map.get(a)+1);
                    }else
                        map.put(a,1);
                }
            }

            for(A key : map.keySet()){
                if(map.get(key)+reward + 1 > max)
                    max = map.get(key)+reward+1;
            }
            if(reward+1 > max) max = reward+1;
            reward = 0;
            map.clear();
        }
        return max;
    }

    public static void main(String [] args){
        new MaxPointsOnALine().maxPoints(null);
    }
}
