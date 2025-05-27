package com.Class.Study250515;

public class Monster {
    private int blood;    //血量

    public Monster(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public boolean isAlive() {
        return blood > 0;
    }

    public void attack(Hero hero, int loseBlood) {
        int lastBlood = hero.getBlood();
        int remainBlood = lastBlood - loseBlood > 0 ? lastBlood - loseBlood : 0;
        hero.setBlood(remainBlood);
    }
}
