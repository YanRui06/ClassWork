package com.Class.Study250515;

public class Hero {
    private int blood;

    public Hero(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public boolean isAlive(){
        return blood >0;
    }

    public void attachMonster(Monster monster,int loseBlood){
        int lastBlood = monster.getBlood();
        int remainBlood = lastBlood - loseBlood > 0 ? lastBlood - loseBlood : 0;
        monster.setBlood(remainBlood);
    }
}
