package com.challenge;

public class ClassOut extends ClassOut1{
    String s = "Out";

    public void print(){
        ClassIn in = new ClassIn(this);
        in.dis();
    }

    public static void main(String [] args){
        ClassOut1 co = new ClassOut1();
        co.print();
    }
}
