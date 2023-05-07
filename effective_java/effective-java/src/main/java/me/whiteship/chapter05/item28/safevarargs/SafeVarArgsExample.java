package me.whiteship.chapter05.item28.safevarargs;

import java.util.List;

public class SafeVarArgsExample {
    static void notSafe(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = List.of(42);
        array[0] = tmpList;
        String s = stringLists[0].get(0);
    }

    @SafeVarargs
    static <T> void safe(T... values) {
        for (T value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SafeVarArgsExample.safe("a", "b", "c");
        SafeVarArgsExample.notSafe(List.of("a", "b", "c"));
    }
}
