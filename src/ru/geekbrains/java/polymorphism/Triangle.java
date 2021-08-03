package ru.geekbrains.java.polymorphism;

public class Triangle implements CalculateArea {
    double triangleBaseLength;
    double triangleHeight;

    public Triangle(double triangleBaseLength, double triangleHeight) {
        this.triangleBaseLength = triangleBaseLength;
        this.triangleHeight = triangleHeight;
    }

    public double getTriangleBaseLength() {
        return triangleBaseLength;
    }

    public void setTriangleBaseLength(double triangleBaseLength) {
        this.triangleBaseLength = triangleBaseLength;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * triangleBaseLength * triangleHeight;
    }
}
