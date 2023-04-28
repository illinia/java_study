package me.whiteship.chapter04.item17;

import me.whiteship.chapter02.item10.Point;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class BigIntExample {
    public static void main(String[] args) {
        BigInteger ten = BigInteger.TEN;
        BigInteger minusTen = ten.negate();

//        Set<Integer> numbers = Set.of(1, 2, 3);
        final Set<Point> points = new HashSet<>();
        Point firstPoint = new Point(1, 2);
        points.add(firstPoint);

//        firstPoint.x = 10;
    }
}
