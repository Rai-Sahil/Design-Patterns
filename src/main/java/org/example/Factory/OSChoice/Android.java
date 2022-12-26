package org.example.Factory.OSChoice;

public class Android extends OS{

    Android() {
        super("Android");
    }

    @Override
    public void specs(){
        System.out.println("Second Best OS...");
    }
}
