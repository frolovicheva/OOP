package ru.geekbrains.java.errors;

public abstract class Car {
    private Engine engine; // changed into private
    private String color;
    private String name;

    public Car(Engine engine, String color, String name) { //add constructor here + inheritors
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public void start() { // changed into public
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
