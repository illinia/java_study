package me.whiteship.chapter01.item05.statisutils;

import me.whiteship.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {
    @Test
    void isValid() {
        assertTrue(SpellChecker.isValid("test"));
    }

}