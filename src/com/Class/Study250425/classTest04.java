package com.Class.Study250425;

import java.util.Scanner;
import java.util.Random;

public class classTest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("程序已启动");
        System.out.println("石头 剪刀 布");

        int i = 1;
        int win = 0;
        int pice = 0;
        while (i <= 5) {
            System.out.print("第" + i + "局");
            String playerInput = scanner.nextLine().trim();

            int playerChoice = convertToNumber(playerInput);
            int computerChoice = random.nextInt(3) + 1; // 电脑随机选择1-3

            System.out.println("你的选择: " + playerInput);
            System.out.println("电脑的选择: " + getChoiceName(computerChoice));

            int result = determineWinner(playerChoice, computerChoice);

            if (result == 0) {
                System.out.println("平局！");
                pice++;
            } else if (result == 1) {
                System.out.println("你赢了！");
                win++;
            } else {
                System.out.println("你输了！");
            }
            i++;
        }
        System.out.println("本次游戏您赢了"+win+"局，平了"+pice+"局");

    }

    // 检查输入是否有效
    public static boolean isValidChoice(String input) {
        return input.equals("石头") || input.equals("剪刀") || input.equals("布");
    }

    // 将中文选择转换为数字（1=石头，2=剪刀，3=布）
    public static int convertToNumber(String choice) {
        switch (choice) {
            case "石头":
                return 1;
            case "剪刀":
                return 2;
            case "布":
                return 3;
            default:
                return -1; // 无效输入
        }
    }

    // 获取电脑选择的名称
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "石头";
            case 2:
                return "剪刀";
            case 3:
                return "布";
            default:
                return "未知";
        }
    }

    // 判断胜负（0=平局，1=玩家赢，-1=电脑赢）
    public static int determineWinner(int player, int computer) {
        if (player == computer) {
            return 0;
        }
        if ((player == 1 && computer == 2) ||
                (player == 2 && computer == 3) ||
                (player == 3 && computer == 1)) {
            return 1;
        } else {
            return -1;
        }
    }
}