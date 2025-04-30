package com.Class.Study250428;

import java.util.Scanner;

public class sortBob {
    public static void main(String[] args) {
        int[][] warehouse = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < warehouse.length; i++) {
            System.out.println("请分别输入第" + (i + 1) + "个仓库中四中产品的库存数");
            for (int i1 = 0; i1 < warehouse[i].length; i1++) {
                warehouse[i][i1] = sc.nextInt();
            }
        }

        for (int i = 0; i < warehouse.length; i++) {
            int sum = 0;
            for (int j = 0; j < warehouse[i].length; j++) {
                sum += warehouse[i][j];
            }
            System.out.println("第" + (i + 1) + "个仓库的总库存数为" + sum + "\n");
        }


    }


}
