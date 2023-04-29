package me.whiteship.chapter04.item20.multipleinheritance;

public class MyCat extends AbstractCat implements Flyable {
    private MyFlyable myFlyable = new MyFlyable();

    @Override
    protected String sound() {
        return "sound";
    }

    @Override
    protected String name() {
        return "name";
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();
        System.out.println(myCat.sound());
        System.out.println(myCat.name());
        myCat.fly();
    }

    @Override
    public void fly() {
        this.myFlyable.fly();
    }

    private class MyFlyable extends AbstractFlyable {
        @Override
        public void fly() {
            System.out.println("private fly");
        }
    }

}
