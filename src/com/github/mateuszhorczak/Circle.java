package com.github.mateuszhorczak;

public class Circle extends Shape {
    public Circle(double lengthFirst, int x, int y) {
        super(lengthFirst, x, y);
    }

    public Circle() {
        super();
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(lengthFirst, 2);
    }

    @Override
    public double perimeter() {
        return lengthFirst * 2 * Math.PI;
    }

    @Override
    public void scale(double value) {
        super.scale(value);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "lengthFirst=" + lengthFirst +
                ", Px=" + x +
                ", Py=" + y +
                '}';
    }
}
