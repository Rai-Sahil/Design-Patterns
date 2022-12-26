package org.example.Factory.OSChoice;

public class Windows extends OS{

    Windows() {
        super("Windows");
    }

    @Override
    public void specs(){
        System.out.println("I'm Dead...");
    }
}
