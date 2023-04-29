package me.whiteship.chapter04.item20.multipleinheritance;

public class AbstractFlyable implements Flyable {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
