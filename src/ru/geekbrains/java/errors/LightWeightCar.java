package ru.geekbrains.java.errors;

public class LightWeightCar extends Car implements Movable {

    public LightWeightCar(Engine engine, String color, String name) {
        super (engine, color, name);
    }

    //Override parent's methods

    @Override
    public void start() {
        super.start ();
    }

    @Override
    public Engine getEngine() {
        return super.getEngine ();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine (engine);
    }

    @Override
    public String getColor() {
        return super.getColor ();
    }

    @Override
    public void setColor(String color) {
        super.setColor (color);
    }

    @Override
    public String getName() {
        return super.getName ();
    }

    @Override
    public void setName(String name) {
        super.setName (name);
    }

    @Override
    public void open() { //made public
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
