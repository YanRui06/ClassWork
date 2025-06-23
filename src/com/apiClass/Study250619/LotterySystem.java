package com.apiClass.Study250619;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static com.apiClass.Study250619.Translate.addTranslation;
import static com.apiClass.Study250619.Translate.dictionary;

public class LotterySystem {
    public static void translateFromEnglish(String english) {
        Set<String> translates = dictionary.get(english.toLowerCase());
        if (translates == null) {
            System.out.println("未找到该单词的中文翻译。");
        } else {
            System.out.print("中文翻译：");
            for (String translation : translates) {
                System.out.print(translation + " ");
            }
            System.out.println();
        }
    }

    public static void translateFromChinese(String chinese) {
        boolean found = false;
        System.out.print("英文翻译：");
        for (Map.Entry<String, Set<String>> entry : dictionary.entrySet()) {
            if (entry.getValue().contains(chinese)) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }
        System.out.println();
        if (!found) {
            System.out.println("未找到该中文词语的英文翻译。");
        }
    }

    public static void translate() {
        String option;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入需要翻译的单词或词语：");
            String input = scanner.nextLine();

            if (input.matches("[a-zA-Z]+")) {
                translateFromEnglish(input);
            } else if (input.matches("[\\u4e00-\\u9fa5]+")) {
                translateFromChinese(input);
            } else {
                System.out.println("输入无效，请输入英文或中文单词/词语。");
            }

            System.out.print("是否继续翻译？（Y/N）");
            option = scanner.next();
        } while (option.equals("Y"));
    }

    public static void main(String[] args) {
        // 添加翻译数据
        addTranslation("bank", new String[]{"银行", "岸"});
        addTranslation("watch", new String[]{"手表", "观看"});
        addTranslation("trip", new String[]{"旅行", "摔倒", "过失"});
        addTranslation("play", new String[]{"玩耍", "演奏", "游戏"});
        addTranslation("park", new String[]{"公园", "停车"});
        addTranslation("note", new String[]{"笔记", "注释"});
        addTranslation("like", new String[]{"喜欢", "希望"});
        addTranslation("enjoy", new String[]{"喜欢", "享受"});
        addTranslation("travel", new String[]{"旅行"});
        addTranslation("ball", new String[]{"球", "舞会"});

        // 用户翻译
        while (true) {
            translate();
        }
    }
}
