package com.Class.Study250529;

public class testException01 {

    // 自定义异常类 AgeException，继承自 Exception
    class AgeException extends Exception {
        // 构造函数，接收一个消息字符串
        public AgeException(String message) {
            super(message); // 调用父类 Exception 的构造函数
        }
    }
    /*public static void main(String[] args) {
       int num = 10;
        int mun1 = 5;
        try {
            int result = num / mun1;
            System.out.println(result+" yes");
        }catch (Exception e){
//            e.printStackTrace();

            System.out.println(e.getMessage());
        }*/

    // saveAge 方法，用于保存年龄，如果年龄不符合条件则抛出 AgeException
    public void saveAge(int age) throws AgeException {
        if (age < 18) {
            System.out.println("your age is lower than 18");
        }else if (age > 18 && age < 24) {
            System.out.println("your age is higher than 24");
        }else{
            // 当年龄不符合指定范围时，抛出 AgeException 异常
            throw new AgeException("Age is not within the specified range (18-24).");
        }
    }

    public static void main(String[] args) {
        // 创建 testException01 类的实例
        testException01 tester = new testException01();
        try {
            // 调用 saveAge 方法，传入年龄 18，此年龄符合条件
            tester.saveAge(18);
            // 调用 saveAge 方法，传入年龄 10，此年龄会抛出 AgeException 异常
            tester.saveAge(10);
        } catch (AgeException e) {
            // 捕获 AgeException 异常，并打印异常消息
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
