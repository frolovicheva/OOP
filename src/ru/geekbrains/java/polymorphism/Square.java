package ru.geekbrains.java.polymorphism;

public class Square implements CalculateArea {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return this.sideLength * this.sideLength;
    }
}
