package com.select;

public class ClassB extends ClassA {
    int b = a;

    ClassB(){

    }

    ClassB(int a){
        super(a);
        System.out.println("Con");
    }

    public static void main(String [] args){
        ClassB b = new ClassB(2);
        System.out.println(b.b);
    }
}
