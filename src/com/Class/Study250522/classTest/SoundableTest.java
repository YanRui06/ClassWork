package com.Class.Study250522.classTest;

import java.util.Scanner;

public class SoundableTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你想听什么，请输入");
        System.out.println("0-Radio 1-Walkman 2-MobliePhone");
        int choice = in.nextInt();
        SampleDisplay sd = new SampleDisplay();
        if(choice == 0){
            sd.display(new Radio());
        }
        else if(choice == 1){
            sd.display(new Walkman());
        }
        else if(choice == 2){
            sd.display(new MobliePhone());
        }else{
            System.out.println("No this choice");
        }
    }
}
