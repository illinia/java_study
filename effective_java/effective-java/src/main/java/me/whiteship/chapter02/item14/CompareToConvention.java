package me.whiteship.chapter02.item14;

import java.math.BigDecimal;

public class CompareToConvention {
    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(123123);
        BigDecimal n2 = BigDecimal.valueOf(111111);
        BigDecimal n3 = BigDecimal.valueOf(234234);
        BigDecimal n4 = BigDecimal.valueOf(111111);

        // 반사성
        System.out.println(n1.compareTo(n1));

        // 대칭성
        System.out.println(n1.compareTo(n2));
        System.out.println(n2.compareTo(n1));

        // 추이성
        System.out.println(n3.compareTo(n1) > 0);
        System.out.println(n1.compareTo(n2) > 0);
        System.out.println(n3.compareTo(n2) > 0);

        // 일관성
        System.out.println(n4.compareTo(n2));
        System.out.println(n2.compareTo(n1));
        System.out.println(n4.compareTo(n1));

        // compareTo 가 0 이라면 equals 는 true 여야 한다. (아닐 수도 있다)
        BigDecimal oneZero = new BigDecimal("1.0");
        BigDecimal oneZeroZero = new BigDecimal("1.00");
        System.out.println(oneZero.compareTo(oneZeroZero));
        System.out.println(oneZero.equals(oneZeroZero));
    }
}
