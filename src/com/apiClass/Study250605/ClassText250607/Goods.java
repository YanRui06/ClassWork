package com.apiClass.Study250605.ClassText250607;

public class Goods {

    String goodsName;
    boolean isDangerious;

    public Goods() {
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public boolean isDangerious() {
        return isDangerious;
    }

    public void setDangerious(boolean dangerious) {
        isDangerious = dangerious;
    }

    public Goods(String goodsName, boolean isDangerious) {
        this.goodsName = goodsName;
        this.isDangerious = isDangerious;

    }
}
