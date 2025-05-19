package com.Class.Study250519Extends;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        System.out.println(s1.name+" "+s1.age);
        System.out.println("我执行如下方法：");
        s1.eat();
        s1.study();
        s1.sleep();
        Teacher t1 = new Teacher();
        t1.name = "李四";
        t1.age = 18;
        t1.salary = 10000;
        System.out.println(t1.name+" "+t1.age+" "+t1.salary);
        System.out.println("我执行如下方法：");
        t1.eat();
        t1.sleep();
        t1.teach();
    }
}
