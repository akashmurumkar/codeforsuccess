package com.autoramming.core.oops;

/**
 * About Polymorphism:
 * Polymorphism means 'many forms'.
 * Polymorphism is a concept in object-oriented programming where objects of different classes can be treated as objects of a common superclass.
 * It allows you to write code that works with objects of different types without knowing the specific type of the object at compile time.
 * Polymorphism is achieved through method overriding and method overloading.
 */

public class Polymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal(); // Parent class object
        animal.makeSound(); // Calls the parent class method

        Animal dog = new Dog(); // Sub class object
        dog.makeSound(); // Calls the overridden method in the sub class

        Animal cat = new Cat(); // Sub class object
        cat.makeSound(); // Calls the overridden method in the sub class
    }

}

class Animal {
    public void makeSound() { // Parent class method
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() { // Overridden method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() { // Overridden method
        System.out.println("Cat meows");
    }
}
