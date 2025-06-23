package com.apiClass.Study250619;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Translate {
    static Map<String, Set<String>>dictionary = new HashMap<String, Set<String>>();
    public static void addTranslation(String word, String[] translations) {
        Set<String> translationSet = new HashSet<String>();
        for (String s : translations) {
            translationSet.add(s);
        }
        dictionary.put(word.toLowerCase(), translationSet);
    }
}
