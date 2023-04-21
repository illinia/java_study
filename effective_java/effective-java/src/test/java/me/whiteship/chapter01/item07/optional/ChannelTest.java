package me.whiteship.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
//        Membership membership = channel.defaultMembership();
//        if (membership != null) {
//            membership.equals(new Membership());
//        }
        Optional<Membership> optionalMembership = channel.defaultMembership();
//        optionalMembership.ifPresent(Membership::hello);
        Membership membership = optionalMembership.get();
        membership.hello();
    }
}