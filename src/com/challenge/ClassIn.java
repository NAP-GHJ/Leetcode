package com.challenge;

public class ClassIn {
    String s = "Hello";
    ClassOut co;

    public ClassIn(ClassOut _co){co = _co;}

    public void dis(){
        System.out.println(co.s);
    }
}
