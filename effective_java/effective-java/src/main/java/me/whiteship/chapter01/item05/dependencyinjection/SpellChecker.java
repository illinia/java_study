package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.DefaultDictionary;
import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

//    public SpellChecker(Supplier<? extends Dictionary> dictionaryFactory) {
//        this.dictionary = dictionaryFactory.get();
//    }

    public SpellChecker(Supplier<Dictionary> dictionaryFactory) {
        this.dictionary = dictionaryFactory.get();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
