package com.Class.Study250522;

public class Triangle extends Shape{

    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
