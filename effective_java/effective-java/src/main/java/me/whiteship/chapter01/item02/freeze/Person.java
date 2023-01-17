package me.whiteship.chapter01.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private int birthYear;
    private final List<String> kids;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.kids = new ArrayList<>();
    }

    public static void main(String[] args) {
        Person person = new Person("test", 1995);
//        person.name = "test2";
        person.kids.add("test3");
    }
}
