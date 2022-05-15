package com.github.mateuszhorczak;

public class Rectangle extends Shape {
    double lengthSecond;

    public Rectangle(double lengthFirst, double lengthSecond, int x, int y) {
        super(lengthFirst, x, y);
        this.lengthSecond = lengthSecond;
    }

    public Rectangle() {
        super();
        lengthSecond = 21;
    }

    @Override
    public double area() {
        return lengthFirst * lengthSecond;
    }

    @Override
    public double perimeter() {
        return 2 * lengthFirst + 2 * lengthSecond;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengthSecond=" + lengthSecond +
                ", lengthFirst=" + lengthFirst +
                ", Px=" + x +
                ", Py=" + y +
                '}';
    }
}