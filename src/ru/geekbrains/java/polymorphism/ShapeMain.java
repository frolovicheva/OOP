package ru.geekbrains.java.polymorphism;

import java.util.Arrays;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        List<CalculateArea> shapes = Arrays.asList (new Circle (10.00),
                new Square (15.00), new Triangle (15.00, 15.00));

        for (CalculateArea shape : shapes) {
            System.out.println (shape.getClass ().getSimpleName () + " area - " + shape.calculateArea ());
        }
    }
}
