package me.whiteship.chapter04.item15.class_and_interfaces.item;

import me.whiteship.chapter04.item15.class_and_interfaces.member.MemberService;

public class ItemService {
    public static final String NAME = "test";

//    MemberService memberService;
    private MemberService memberService;

    boolean onSale;

    protected int saleRate;

    public ItemService(MemberService memberService) {
        if (memberService == null) {
            throw new IllegalArgumentException("Member Service should not be null");
        }
        this.memberService = memberService;
    }

//    public MemberService getMemberService() {
//        return memberService;
//    }

    MemberService getMemberService() {
        return memberService;
    }
}
