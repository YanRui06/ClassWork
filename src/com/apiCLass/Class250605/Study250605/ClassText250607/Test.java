package com.apiCLass.Class250605.Study250605.ClassText250607;

public class Test {
    public static void main(String[] args) {
        Machine m = new Machine();
        Goods g1 = new Goods("汽油",true);
        Goods g2 = new Goods("衣服",false);
        Goods goods[] = new Goods[]{g1,g2};
        for(Goods g : goods){
            m.check(g);
        }

    }
}
