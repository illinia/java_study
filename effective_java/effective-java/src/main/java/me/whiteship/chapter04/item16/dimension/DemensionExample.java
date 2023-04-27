package me.whiteship.chapter04.item16.dimension;

import java.awt.*;

public class DemensionExample {
    public static void main(String[] args) {
        Button button = new Button("hello button");
        button.setBounds(0, 0, 20, 10);

        Dimension size = button.getSize();
        System.out.println(size.height);
        System.out.println(size.width);

        doSomething(size);
    }

    private static void doSomething(Dimension dimension) {
        dimension.width = 10;
    }
}
