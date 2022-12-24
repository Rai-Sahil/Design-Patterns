package org.example.Command;

/**
 * What device is remote trying to connect.
 */
public class Remote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
