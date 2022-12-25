package org.example.Prototype.AnimalExample;

public class Dog implements Animal{

    Dog () {
        System.out.println("I'm a Dog...");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        System.out.println("Dog is Being made");
        Dog dog = null;
        dog = (Dog) super.clone();
        return dog;
    }

    @Override
    public String toString() {
        return "Bhau bhau";
    }
}
