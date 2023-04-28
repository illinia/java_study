package me.whiteship.chapter04.item17;

public final class Person {
    private final Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
//        Address address1 = new Address();
//        address1.setCity(this.address.getCity());
//        address1.setStreet(this.address.getStreet());
//        address1.setZipCode(this.address.getZipCode());
//        return address1;
        return this.address;
    }

    public static void main(String[] args) {
        Address address2 = new Address();
        address2.setCity("test");

        Person person = new Person(address2);

        Address address1 = person.getAddress();
        address1.setCity("test1");

        System.out.println(person.address.getCity());
    }
}
