package me.whiteship.chapter01.item05.statisutils;

import me.whiteship.chapter01.item05.DefaultDictionary;
import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {
    private static final Dictionary dictionary = new DefaultDictionary();
    private SpellChecker() {}

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
