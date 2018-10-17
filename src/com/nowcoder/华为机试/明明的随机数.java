package com.nowcoder.华为机试;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class 明明的随机数 {

    public static void main(String [] args){
        TreeSet<Integer> set = new TreeSet<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //input.nextLine();
        for(int i = 0; i < n; i++){
            set.add(input.nextInt());
            //input.nextLine();
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
