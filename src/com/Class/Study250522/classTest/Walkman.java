package com.Class.Study250522.classTest;

public class Walkman implements Soundable{
    @Override
    public void playSound() {
        System.out.println("正在播放歌曲～～");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("以降低随声听音量");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭随身听");
    }
}
