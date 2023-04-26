package me.whiteship.chapter02.item14.decimal;

public class IntOverflow {
    public static void main(String[] args) {
        System.out.println(-Integer.MIN_VALUE - 10);
        System.out.println(Integer.compare(Integer.MIN_VALUE, 10));
    }
}
