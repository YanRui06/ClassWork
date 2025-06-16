package com.apiClass.Study250605.ClassText250607;

public class Machine {

    public void check(Goods goods){
        if (goods.isDangerious()){
            DangerException dangerException = new DangerException();
            System.out.println(dangerException.getMessage());
            System.out.println(goods.getGoodsName()+"禁止通过");
        }else {
            System.out.println(goods.getGoodsName()+"检测通过");
        }
    }

}
