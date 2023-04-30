package me.whiteship.chapter05.item26.terms;

public class Box<E> {
    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(100);
        System.out.println(box.get() * 100);
//        box.add("whiteship");
        printBox(box);
    }

    private static void printBox(Box<? extends Object> box) {
        System.out.println(box.get());
    }
}
