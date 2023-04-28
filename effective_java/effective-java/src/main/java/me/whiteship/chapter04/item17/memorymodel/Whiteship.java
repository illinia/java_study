package me.whiteship.chapter04.item17.memorymodel;

public class Whiteship {
//    private int x;
//    private int y;

    private final int x;
    private final int y;

    public Whiteship() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        // 메모리 모델은 한 쓰레드에서 유효한지 확인. 필드가 final 이 아니면 멀티 쓰레드에서는 불안정한 초기화가 실행될 수 있다.
        // 1, 2가 랜덤으로 일어날 수 있다.
        // Object w = new Whiteship()
        // 1. whitehsip = w
        // w.x = 1
        // w.y = 2
        // 2. whitehsip = w

        Whiteship whiteship = new Whiteship();
    }
}
