package me.whiteship.chapter05.item27.suppress;

import java.util.Arrays;

public class ListExample {
    private int size;
    Object[] elements;

//    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            /**
             * 어노테이션이 왜 붙어있는지 섦명
             */
            @SuppressWarnings("unchecked")
            T[] ts = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return ts;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
}
