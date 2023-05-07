package me.whiteship.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {
    public static void main(String[] args) {
        Object[] anything = new String[10];
//        anything[0] = 1;

        List<String> names = new ArrayList<>();
//        List<Object> objects = names;

//        List<String>[] stringLists = new ArrayList<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects = stringLists;
//        objects[0] = intList;
//        String s = stringLists[0].get(0);
    }
}
