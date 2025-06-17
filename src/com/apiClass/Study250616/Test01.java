package com.apiClass.Study250616;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(String.valueOf(1));
        list.add("allen");
        list.add(String.valueOf(3.0));
        list.add("夏利");
        list.add(2, "蚌");
        System.out.println(list);
        //1.使用迭代器实现遍历列表
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //2.for循环实现遍历列表
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //3.foreach实现遍历列表
        for (Object item : list) {
            System.out.println(item);
        }

    }
}
