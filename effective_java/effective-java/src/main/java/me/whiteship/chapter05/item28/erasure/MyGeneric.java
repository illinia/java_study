package me.whiteship.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("test");
//        String name = names.get(0);
//        System.out.println(name);

        List names = new ArrayList();
        names.add("test");
        Object o = names.get(0);
        String name = (String) o;
    }
}
