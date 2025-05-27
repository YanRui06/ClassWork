package com.Class.Study250526.homeWork;

import java.util.Scanner;

public class TestMusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------多媒体音乐播放器----------");
        System.out.println("1,音乐频道 2,评书频道");
        Media mediaPlayer = new Media();

        System.out.println("输入要进入的频道");
        int op1 = sc.nextInt();
        switch (op1) {
            case 1:
                Player musicPlayer = mediaPlayer.musicPlayer();
                System.out.println("1.添加歌曲");
                System.out.println("2.播放指定序号的歌曲");
                System.out.println("3.停止播放");
                System.out.println("4.退出多媒体");
                while (true) {
                    System.out.println("请输入要进行的操作：");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            musicPlayer.addMedia();
                            break;
                        case 2:
                            musicPlayer.playAppoint();
                            break;
                        case 3:
                            musicPlayer.stop();
                            break;
                        case 4:
                            System.out.println("退出多媒体....");
                            System.exit(0);
                    }
                }
            case 2:
                Player tellStoryPlayer = mediaPlayer.storytellingPlayer();
                System.out.println("1. 添加评书");
                System.out.println("2. 播放指定序号的评书");
                System.out.println("3. 停止播放");
                System.out.println("4. 退出多媒体");
                while (true) {
                    System.out.print("请输入要进行的操作:");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            tellStoryPlayer.addMedia();
                            break;
                        case 2:
                            tellStoryPlayer.playAppoint();
                            break;

                        case 3:
                            tellStoryPlayer.stop();
                            break;

                        case 4:
                            System.out.print("退出多媒体...");
                            System.exit(0);
                            break;

                    }

                }

            default:
                System.out.print("输入选项无效，请再次确认！");
                break;
        }
    }
}
