package com.apiCLass.Class250605.Study250605;

import java.util.Scanner;

public class mathApiTest {
    static StringBuffer sb = new StringBuffer();
    static int inNum;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------食材入库---------");
        sb.append("本次入库详情:"+"\r\n");
        boolean flag = true;
        while (flag) {
            inGoods();
            System.out.println("是否继续入库，(是输入Y,否输入N)：");
            String s = sc.next();
            if (s.equals("N")) {
                flag = false;
            }
        }

        System.out.println(sb.toString() + "入库总数量：" + inNum);

    }

    public static void inGoods(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入入库信息（格式：食材名称-入库数量）：");
        String str = sc.next();
        if(!str.contains("-")){
            System.out.println("格式错误");
        }else{
            sb.append(str+"\r\n");
            String[] arr = str.split("-");
            inNum += Integer.valueOf(arr[1]);
        }

    }

}
