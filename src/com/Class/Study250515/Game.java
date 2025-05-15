package com.Class.Study250515;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Hero hero = new Hero(500);
        Monster monster = new Monster(500);
        System.out.println("-----------打怪小游戏---------");
        System.out.println(attach(hero,monster));
    }

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static String attach(Hero hero,Monster monster) {
        while(hero.isAlive()&&monster.isAlive()){
            int heroLoseBlood = random(0,100);
            monster.attack(hero,heroLoseBlood);
            System.out.println("怪兽攻击英雄，英雄掉血"+heroLoseBlood+"剩余血量"+hero.getBlood());
            if(!hero.isAlive()){
                return "Hero die";
            }

            int monsterLoseBlood = random(0,100);
            hero.attachMonster(monster,monsterLoseBlood);
            System.out.println( "英雄攻击怪兽，怪兽掉血" + monsterLoseBlood +
                    ",剩余血量" + monster.getBlood());
        }
        return "Moster die";
    }
}
