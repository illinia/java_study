package me.whiteship.chapter02.item13.treeset;


import me.whiteship.chapter02.item13.PhoneNumber;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<PhoneNumber> numbers = new TreeSet<>(Comparator.comparingInt(PhoneNumber::hashCode));
        Set<PhoneNumber> phoneNumbers = Collections.synchronizedSet(numbers);
        numbers.add(new PhoneNumber(123, 456, 780));
        numbers.add(new PhoneNumber(123, 456, 7890));
        numbers.add(new PhoneNumber(123, 456, 789));

        for (PhoneNumber number : numbers) {
            System.out.println(number);
        }
    }
}
