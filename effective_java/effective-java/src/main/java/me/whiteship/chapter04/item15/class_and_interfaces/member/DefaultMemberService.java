package me.whiteship.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService {
    private static class PrivateStaticClass {

    }
    private String member;

    // 외부 인스턴스를 항상 참조하는 필드가 생성
    private class PrivateClass {
        // 외부 클래스의 private 필드에 접근이 쉬움
        void doPrint() {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

//    MemberRepository memberRepository;
//
//    public Member getMember() {
//        memberRepository.findById();
//        return null;
//    }
//
//    private static interface MemberRepository {
//    }
}
