package com.apiClass.Study250619;

import com.Class.Study250526.ClassProgream.Order;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        /*HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        System.out.println(map);
        Object s = map.get(2);
        System.out.println(s);
*/
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "张三");
        hm.put(2, "李四");
        hm.put(3, "王五");
        hm.put(4, "王五");
        System.out.println(hm.get(2));
        hm.remove(2);

        System.out.println(hm.size());
        System.out.println(hm.containsKey(3));
        System.out.println("hm.containsValue(\"王五\")" + hm.containsValue("王五"));
        System.out.println("hm.isEmpty()" + hm.isEmpty());
        System.out.println("hm.keySet()" + hm.keySet());
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            System.out.println("key:" + key + " value:" + hm.get(key));
        }
        Collection values = hm.values();
        for (Object value : values) {
            System.out.println("value:" + value);
        }

        //values=[张三, 李四, 王五]
        //1. value="张三"
        //2. value="李四"
        //3. value="王五"

//        for(int i=0;i<values.size();i++){
//            System.out.println("value:"+values.toArray()[i]);
//        }

        System.out.println(hm);
        //获得所有的键值对
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("entry:" + entry);
//            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        System.out.println("hm.values()" + hm.values());
//        hm.remove(2);
//        System.out.println(hm);

    }
}
