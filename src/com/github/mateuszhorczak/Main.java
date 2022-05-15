package com.github.mateuszhorczak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        double result;

        Circle cir1 = new Circle(3, 0, 1);
        System.out.println(cir1);
        cir1.move(2, 3);
        System.out.println(cir1);

        Square squ1 = new Square(10, 0, 1);
        System.out.println(squ1);
        squ1.move(-10, 8);
        System.out.println(squ1);

        Triangle tr1 = new Triangle(5, 0, 0, 6, 8, 10);
        System.out.println(tr1);
        tr1.move(-1, 4);
        System.out.println(tr1);

        Rectangle rec1 = new Rectangle(5, 2, 0, 0);
        System.out.println(rec1);
        rec1.move(-2, -2);
        System.out.println(rec1);

        shapes.add(cir1);
        shapes.add(squ1);
        shapes.add(tr1);
        shapes.add(rec1);

        //Zwykle sumy
        double areaSum = 0;
        for (var item : shapes) {
            areaSum += item.area();
        }
        double temp1 = areaSum;
        System.out.println("\n" + "Suma pol: " + areaSum);

        double perimeterSum = 0;
        for (var item : shapes) {
            perimeterSum += item.perimeter();
        }
        double temp2 = perimeterSum;
        System.out.println("Suma obwodow: " + perimeterSum + "\n");

        //Przesuwanie
        for (var item : shapes) {
            item.move(2, -1);
        }

        areaSum = 0;
        for (var item : shapes) {
            areaSum += item.area();
        }
        System.out.println("Suma pol po przesunieciu: " + areaSum);

        perimeterSum = 0;
        for (var item : shapes) {
            perimeterSum += item.perimeter();
        }
        System.out.println("Suma obwodow po przesunieciu: " + perimeterSum + "\n");

        for (var item : shapes) {
            item.scale(2);
        }

        //porownanie
        result = areaSum / temp1;
        System.out.println("Iloraz pol przed i po przesunieciu wynosi: " + result);

        result = perimeterSum / temp2;
        System.out.println("Iloraz obwodow przed i po przesunieciu wynosi: " + result + "\n");

        //Skalowanie
        areaSum = 0;
        for (var item : shapes) {
            areaSum += item.area();
        }
        System.out.println("Suma pol po przeskalowaniu: " + areaSum);

        perimeterSum = 0;
        for (var item : shapes) {
            perimeterSum += item.perimeter();
        }
        System.out.println("Suma obwodow po przeskalowaniu: " + perimeterSum + "\n");

        //porownanie2
        result = areaSum / temp1;
        System.out.println("Iloraz pol przed i po przesunieciu wynosi: " + result);

        result = perimeterSum / temp2;
        System.out.println("Iloraz obwodow przed i po przesunieciu wynosi: " + result);

    }
}