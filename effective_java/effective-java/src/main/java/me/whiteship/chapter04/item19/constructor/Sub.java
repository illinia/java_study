package me.whiteship.chapter04.item19.constructor;

import java.time.Instant;

public final class Sub extends Super{
    private final Instant instant;

    private Sub() {
        super();
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
