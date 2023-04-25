package me.whiteship.chapter02.item13.clone_use_constructor;

public class Item {
    private String name;

//    @Override
//    public Item clone() {
//        Item item = new Item();
//        item.name = this.name;
//        return item;
//    }


    @Override
    public Item clone() {
        try {
            Item clone = (Item) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
