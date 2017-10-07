package com.challenge;

import java.util.*;

public class Class2 {

    static long fun(long x ){
        if(x == (long)1) return 1;

        int level = 3;

        List<Long> current = new ArrayList<>();
        List<Long> last = new ArrayList<>();
        current.add((long)1);
        current.add((long)1);

        while (true){
            last = current;
            current = new ArrayList<>();

            current.add((long)1);

            Iterator it = last.listIterator();
            long first = (long)it.next();
            long second;
            while (it.hasNext()){
                second = (long)it.next();

                if(first + second == x) return level;
                current.add(first+second);
                first = second;
            }

            current.add((long)1);
            System.out.println(current);
            level ++;
        }
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        long res;

        long _x = Long.parseLong(in.nextLine().trim());

        res = fun(_x);
        System.out.println(String.valueOf(res));

    }
}
