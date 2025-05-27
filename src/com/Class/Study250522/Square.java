package com.Class.Study250522;

public class Square extends Shape{

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void print() {
        for(int i = 0; i < sideLength; i++) {
            for(int j = 0; j < sideLength; j++) {
                System.out.print("*");
                if(j != sideLength - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
