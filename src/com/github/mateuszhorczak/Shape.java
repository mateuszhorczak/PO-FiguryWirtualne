package com.github.mateuszhorczak;

public class Shape {
    protected double lengthFirst;
    protected int x, y;

    public Shape(double lengthFirst, int x, int y) {
        this.lengthFirst = lengthFirst;
        this.x = x;
        this.y = y;
    }

    public Shape() {
        lengthFirst = 5;
        x = 0;
        y = 0;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void scale(double value) {
        lengthFirst *= value;
    }

    public double area() {
        return Math.pow(2 * lengthFirst, 2);
    }

    public double perimeter() {
        return 8 * lengthFirst;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "lengthFirst=" + lengthFirst +
                ", Px=" + x +
                ", Py=" + y +
                '}';
    }
}
