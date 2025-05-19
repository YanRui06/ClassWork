package com.Class.Study250519Extends.wokeTest;

public class Test {
    public static void main(String[] args) {
        Goat goat = new Goat("亚羊科");
        System.out.println("sheep is" + goat.getType() + "Animal");
        goat.eat();
        goat.walk();

        Wolf wolf = new Wolf("犬科");
        System.out.println("wolf is" + wolf.getType() + "Animal");
        wolf.eat();
        wolf.walk();
    }
}
