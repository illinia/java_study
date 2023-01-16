package me.whiteship.chapter01.item01;

public interface HelloService {
    String hello();

    static public String hi() {
        prepareMessage();
        return "hi";
    }

    static private void prepareMessage() {
    }

    static public String hi1() {
        prepareMessage();
        return "hi";
    }

    static public String hi2() {
        prepareMessage();
        return "hi";
    }

    default String bye() {
        return "bye";
    }
}
