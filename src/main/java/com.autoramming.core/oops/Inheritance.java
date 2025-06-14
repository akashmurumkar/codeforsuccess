package com.autoramming.core.oops;

/**
 * About Inheritance:
 * Inheritance is a way of reusing the code and functionality of a parent class in a child class.
 * It allows you to create a hierarchy of classes, where the child class inherits the attributes and behavior of the parent class.
 */

public class Inheritance {

    public static void main(String[] args) {
        Vehicle parent = new Vehicle();

        Car car = new Car(); // sub class inherits parent
        car.honk();
        System.out.println("Car brand: " + car.brand);
    }

}

class Vehicle {
    protected final String brand = "Honda";

    public void honk() {
        System.out.println("HONK HONK");
    }

}

class Car extends Vehicle {

    private final String model = "Civic";

}
