package org.example.Prototype.AnimalExample;

public class TestCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep cloneSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println();
        System.out.println(cloneSheep);

        System.out.println("Sally Hashcode : " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone Hashcode : " + System.identityHashCode(System.identityHashCode(cloneSheep)));
    }

}
