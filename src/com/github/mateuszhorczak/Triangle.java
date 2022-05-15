package com.github.mateuszhorczak;

public class Triangle extends Shape {
    double a, b, c;

    public Triangle(double lengthFirst, int x, int y, double a, double b, double c) {
        super(lengthFirst, x, y);
        this.a = a;
        this.b = b;
        this. c = c;
    }

    public Triangle() {
        super();
        a = 3;
        b = 4;
        c = 5;
    }

    @Override
    public void scale(double value) {
        super.scale(value);
        a *= value;
        b *= value;
        c *= value;
    }

    @Override
    public double area() {
        return (a * b * c) / (4 * lengthFirst);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }



    @Override
    public void move(double dx, double dy) { //TODO nie dziala
        super.move(dx, dy);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lengthFirst=" + lengthFirst +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Px=" + x +
                ", Py=" + y +
                '}';
    }
}
