package com.leetcode.basic;

import java.util.Stack;

public class Class20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character pop,next;
        for(int i = 0; i < s.length(); i++){
            next = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(next);
                continue;
            }
            pop = stack.peek();
            if((pop.equals('(') && next.equals(')'))||
                    pop.equals('{') && next.equals('}')||
                    pop.equals('[') && next.equals(']')){
                stack.pop();
            }else
                stack.push(next);
        }
        return stack.isEmpty();
    }

    public static void main(String [] args){
        String test = "(([)]))";
        boolean result = new Class20().isValid(test);
        System.out.println(result);
    }
}
