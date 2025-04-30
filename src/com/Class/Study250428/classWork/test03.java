package com.Class.Study250428.classWork;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int number = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("is not the number");
        }



    }
}
