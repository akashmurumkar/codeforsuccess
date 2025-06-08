package com.autoramming.core.basics;

public class Classes {

    // What are classes?
    // Classes serve as blueprints for creating objects, encapsulating data (fields) and behavior (methods).
    // Or in other words, a class is a blueprint for creating objects.
    // It defines the structure and behavior of an object.
    // It is a template for creating objects.

    // Classes are fundamental to object-oriented programming, promoting code organization, reusability, and maintainability.

    // Rules to define a class:
    // 1. Class names should start with an uppercase letter and contain only letters, digits, and underscores.
    // 2. Class names should be descriptive and meaningful.
    // 3. Class names should be unique within a package.
    // 4. Class names should be case-sensitive. "Dog" and "dog" are different classes.

    // A class definition typically includes:
    // 1. Class Declaration: Begins with the class keyword followed by the class name. By convention, class names start with an uppercase letter.
    // 2. Fields: Variables that store the state of an object.
    // 3. Methods: Functions that define the behavior of an object.
    // 4. Constructors: Special methods used to initialize objects when they are created.

    static class Dog {
        // Fields
        String name;
        String breed;
        int age;

        // Constructor
        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        // Method
        public void bark() {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);

        // Accessing fields
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.age);

        // Calling a method
        myDog.bark();
    }
}
