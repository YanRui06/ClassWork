package com.Class.Study250522.classTest;

import java.util.Scanner;

public class SampleDisplay {
    public void display(Soundable soundable){
        soundable.playSound();
        System.out.println("您是否要降低音量");
        System.out.println("1-yes,2-no");
        Scanner in = new Scanner(System.in);
        if(in.nextLine() .equals("1")){
            soundable.decreaseVolume();
        }
        System.out.println("您是否要关机");
        System.out.println("1-yes,2-no");
        Scanner in2 = new Scanner(System.in);
        if(in2.nextLine() .equals("1")){
            soundable.stopSound();
        }

    }
}
