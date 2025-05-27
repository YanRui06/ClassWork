package com.Class.Study250425;

import java.util.Scanner;

public class classTest03 {
    public  static void main(String[] args){
        String name="lis";
        String  language="java";
        char continues='y';
        Scanner scanner=new Scanner(System.in);
        for (;continues=='y'||continues=='Y';){
            switch (language){
                case "java":
                    System.out.println("被"  + name +"分配到java程序开发部门");
                    break;
                case "html":
                    System.out.println("被"  + name +"分配到前端开发部门");
                    break;
                case "c#":
                    System.out.println("被"  + name +"分配到c#程序开发部门");
                    break;
                case "apt.net":
                    System.out.println("被"  + name +"分配到程序测试部门");
                    break;
                default:
                    System.out.println("抱歉，我们不需要"+ language +"语言的人");
                    break;
            }
          System.out.println("是否需要继续员工分配？y或Y表示继续，其他表示退出");
            continues = scanner.next().charAt(0);
            if (continues=='y'||continues=='Y'){
                System.out.println("请输入新员工的名字");
                name =scanner.next();
                System.out.println("请输入新员工应聘的语言");
                language=scanner.next();
            }
        }
    }
}
