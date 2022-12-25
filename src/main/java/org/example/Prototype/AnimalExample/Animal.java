package org.example.Prototype.AnimalExample;

public interface Animal extends Cloneable {

    Animal makeCopy() throws CloneNotSupportedException;

}
