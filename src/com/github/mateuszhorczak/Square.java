package com.github.mateuszhorczak;

public class Square extends Shape {
    public Square(double lengthFirst, int x, int y) {
        super(lengthFirst, x, y);
    }

    public Square() {
        super();
    }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public void scale(double value) {
        super.scale(value);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public String toString() {
        return "Square{" +
                "lengthFirst=" + lengthFirst +
                ", Px=" + x +
                ", Py=" + y +
                '}';
    }
}
