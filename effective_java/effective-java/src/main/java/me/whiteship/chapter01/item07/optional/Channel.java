package me.whiteship.chapter01.item07.optional;

import java.util.Optional;

public class Channel {
    private int numOfSubscribers;

    public Optional<Membership> defaultMembership() {
        if (this.numOfSubscribers < 2000) {
//            return null;
//            throw new IllegalStateException();
            return Optional.empty();
        } else {
//            return new Membership();
            return Optional.of(new Membership());
        }
    }
}
