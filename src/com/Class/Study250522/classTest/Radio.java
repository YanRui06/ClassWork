package com.Class.Study250522.classTest;

public class Radio implements Soundable{
    @Override
    public void playSound() {
        System.out.println("收音机播放广播～");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("以降低收音机音量");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭收音机。");
    }
}
