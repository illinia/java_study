package me.whiteship.chapter04.item16.point.method;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // 부가작업 가능
        return x;
    }

    public void setX(double x) {
        // 부가작업 가능
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
