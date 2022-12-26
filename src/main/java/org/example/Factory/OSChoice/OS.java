package org.example.Factory.OSChoice;

public abstract class OS {

    String name;

    OS(String name) {
        this.name = name;
    }

    public abstract void specs();
}
