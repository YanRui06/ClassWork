package com.Class.Study250522;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void print() {
        for(int y = 0; y <= 2 * radius; y += 2){
            //通过圆形方程推导出当前行左侧圆形边界的位置
            int x = (int) Math.round(radius - Math.sqrt(2 * radius * y - y * y));
            //计算当前行需要打印的空格数，也就是左侧边界到右侧边界中间的空格数
            int len = 2 * (radius - x);
            //打印当前行圆形边界的左侧空格
            for (int i = 0; i <= x; i ++){
                System.out.print(' ');
            }
            //打印当前行圆形边界上的点
            System.out.print('*');
            //打印当前行左侧边界和右侧边界中间的空格
            for(int j = 0; j <= len; j ++){
                System.out.print(' ');
            }
            //打印右侧边界
            System.out.println('*');
        }
    }
}
