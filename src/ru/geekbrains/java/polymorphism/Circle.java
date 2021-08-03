package ru.geekbrains.java.polymorphism;

public class Circle implements CalculateArea {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }
}
