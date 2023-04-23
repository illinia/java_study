package me.whiteship.chapter01.item08.autocloseable;

public class App {
    public static void main(String[] args) {
        try (AutoCloseableIsGood good = new AutoCloseableIsGood("")) {

        }
    }
}
