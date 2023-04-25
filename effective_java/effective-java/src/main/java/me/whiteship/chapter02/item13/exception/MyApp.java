package me.whiteship.chapter02.item13.exception;

public class MyApp {
    public void hello(String name) throws MyException {
        if (name.equals("exception")) {
            throw new MyException();
        }
        System.out.println("hello");
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyApp myApp = new MyApp();
        try {
            myApp.hello("exception");
        } catch (MyException e) {
            myApp.hello("noexception");
        }
    }
}
