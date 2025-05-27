package com.Class.Study250519Extends;

public class Student extends People {
    public void study(){
        System.out.println("Student study");
    }

    @Override
    public void sleep() {
        System.out.println("Student sleep");
    }
}
