package org.example.Prototype.AnimalExample;

public class Sheep implements Animal{

    Sheep(){
        System.out.println("Sheep is Made...");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        System.out.println("Sheep is Being Made");
        Sheep sheep = null;
        sheep = (Sheep) super.clone();

        return sheep;
    }

    @Override
    public String toString() {
        return "Meeeeheeee";
    }
}
