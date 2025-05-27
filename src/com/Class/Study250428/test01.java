package com.Class.Study250428;

public class test01 {
    public static void main(String[] args) {

        int[] temp = new int[]{1,2,5,43,6,7,8};
        int sum = 0;
        int i = 0;
        while(i<temp.length){
            System.out.println("第"+(i+1)+"个员工为"+temp[i]);
            sum += temp[i];
            i++;
        }
        System.out.println(sum);







































    }
}
