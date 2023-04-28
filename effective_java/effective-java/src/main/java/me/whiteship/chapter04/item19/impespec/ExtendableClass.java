package me.whiteship.chapter04.item19.impespec;

public class ExtendableClass {

    /**
     * javadoc -d target/apidoc src/main/java/me/whiteship/chapter04/item19/impespec/* -tag "implSpec:a:Implementation Requirements:"
     *
     * @implSpec
     * use System.out.println()
     */
    public void doSomething() {
        System.out.println("hello");
    }
}
