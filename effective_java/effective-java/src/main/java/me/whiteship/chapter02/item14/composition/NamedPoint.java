package me.whiteship.chapter02.item14.composition;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NamedPoint implements Comparable<NamedPoint>{
    private final String name;
    private final Point point;

    public NamedPoint(String name, Point point) {
        this.name = name;
        this.point = point;
    }

    public Point getPoint() {
        return this.point;
    }

    @Override
    public int compareTo(NamedPoint namedPoint) {
        int result = this.point.compareTo(namedPoint.point);
        if (result == 0) {
            result = this.name.compareTo(namedPoint.name);
        }
        return result;
    }
}
