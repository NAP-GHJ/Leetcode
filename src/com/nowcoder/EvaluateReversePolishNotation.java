package com.nowcoder;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            switch (tokens[i]){
                case "+":
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())));
                    break;
                case "-":
                    stack.push(String.valueOf(-Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())));
                    break;
                case "*":
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop())));
                    break;
                case "/":
                    int tmp = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())/tmp));
                    break;
                default:
                    stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String [] args){
        args = new String [] {"4", "13", "5", "/", "+"};
        System.out.println(new EvaluateReversePolishNotation().evalRPN(args));
    }
}
