package com.apiClass.Study250616;

import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        treeSet.add("date");
        treeSet.add("elderberry");
        System.out.println("TreeSet: " + treeSet);
        
        //1.使用迭代器实现遍历TreeSet
        System.out.println("使用迭代器遍历:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        //2.foreach实现遍历TreeSet
        System.out.println("使用foreach遍历:");
        for (String item : treeSet) {
            System.out.println(item);
        }
        
        //3.使用Stream遍历TreeSet
        System.out.println("使用Stream遍历:");
        treeSet.stream().forEach(System.out::println);
        
        // TreeSet特有操作
        System.out.println("第一个元素: " + treeSet.first());
        System.out.println("最后一个元素: " + treeSet.last());
        System.out.println("小于cherry的元素: " + treeSet.headSet("cherry"));
        System.out.println("大于等于cherry的元素: " + treeSet.tailSet("cherry"));
    }
}