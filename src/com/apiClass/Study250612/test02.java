package com.apiClass.Study250612;

import java.util.ArrayList;
import java.util.List;

public class test02 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        List list1 = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1, "e");
        list.remove(1);
        System.out.println(list);
    }
}
