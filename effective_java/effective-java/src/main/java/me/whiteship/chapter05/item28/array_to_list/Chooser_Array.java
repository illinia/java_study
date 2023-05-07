package me.whiteship.chapter05.item28.array_to_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser_Array<T> {
    private final List<T> choiceList;

    public Chooser_Array(Collection<T> choiceList) {
        this.choiceList = new ArrayList<>(choiceList);
    }
    
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
//        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        List<String> intList = List.of("1", "2");

//        Chooser_Array<Integer> chooser = new Chooser_Array<>(intList);
        Chooser_Array<String> chooser = new Chooser_Array<>(intList);

        for (int i = 0; i < 10; i++) {
//            Number choice = chooser.choose();
            String choice = chooser.choose();
            System.out.println(choice);
        }
    }
}
