package com.Class.Study250522.classTest;

public class MobliePhone implements Soundable{
    @Override
    public void playSound() {
        System.out.println("手机铃声");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("以降低手机铃声");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭手机");
    }
}
