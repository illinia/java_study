package me.whiteship.chapter05.item26.terms;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        List numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add("whiteship");

        for (Object number : numbers) {
            System.out.println((Integer) number);
        }

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add("whiteship");
//
//        for (Object number : numbers) {
//            System.out.println((Integer) number);
//        }
    }
}
