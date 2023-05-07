package me.whiteship.chapter05.item29.bounded_type;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E extends Number> {
    private Number[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = new Number[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (Integer arg : List.of(1, 2, 3)) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
//            System.out.println(((Integer) stack.pop()).toUpperCase());
            System.out.println(stack.pop());
        }
    }
}

