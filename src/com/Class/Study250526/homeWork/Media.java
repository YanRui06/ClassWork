package com.Class.Study250526.homeWork;

import java.util.Scanner;

public class Media {
    Scanner sc = new Scanner(System.in);

    public Player musicPlayer(){
        return new Player() {
            private int currentIndex = 1;
            private Music[] songs = new Music[10];
            @Override
            public void addMedia() {
                System.out.println("请输入要添加歌曲的名称和时长：");
                String musicName = sc.next();
                int duration = sc.nextInt();
                Music song = new Music(musicName, duration);
                songs[currentIndex] = song;
                System.out.println("成功添加第" + currentIndex + "首歌曲！");
                currentIndex++;
            }

            @Override
            public void playAppoint() {
                System.out.println("请输入要播放的歌曲序号：");
                int index = sc.nextInt();
                if(index >= 0 && index < currentIndex){
                    System.out.println("正在播放歌曲:/"+songs[index].getName()+"/，时长为"+songs[index].getDuration()+"秒。");
                }else{
                    System.out.println("输入序号无效");
                }
            }

            @Override
            public void stop() {
                System.out.println("停止播放音乐");
            }
        };
    }

    public Player storytellingPlayer(){
        return new Player() {
            private int currentIndex = 1;
            private storyTelling[] storyTellings = new storyTelling[10];
            @Override
            public void addMedia() {
                System.out.println("请输入要添加评书的书籍名称和评书人：");
                String storyName = sc.next();
                String tellPeople = sc.next();
                storyTelling st = new storyTelling(storyName, tellPeople);
                storyTellings[currentIndex] = st;
                System.out.println("成功添加");
                currentIndex++;
            }

            @Override
            public void playAppoint() {
                System.out.println("请输入要播放的评书序号：");
                int index = sc.nextInt();
                if(index >= 0 && index < currentIndex){
                    System.out.println("正在播放评书：《"+storyTellings[index].getStoryName()+"》，评书人为"+storyTellings[index].getTellPeople());
                }else{
                    System.out.println("序号无效");
                }
            }

            @Override
            public void stop() {
                System.out.println("停止播放评书。");
            }
        };
    }
}
