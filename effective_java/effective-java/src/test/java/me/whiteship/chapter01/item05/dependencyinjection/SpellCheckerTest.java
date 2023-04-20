package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.DefaultDictionary;
import me.whiteship.chapter01.item05.Dictionary;
import me.whiteship.chapter01.item05.MockDictionary;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
//        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
        spellChecker.isValid("test");
    }

}