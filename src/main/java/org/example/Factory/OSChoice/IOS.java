package org.example.Factory.OSChoice;

public class IOS extends OS{

    IOS() {
        super("IOS");
    }

    @Override
    public void specs() {
        System.out.println("The best OS...");
    }
}
