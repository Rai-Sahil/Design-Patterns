package org.example.Command;

/**
 * Receiver For The Command
 */
public class Television implements ElectronicDevice{

    private int volume = 0;
    private boolean tvOn = false;

    @Override
    public void on() {
        tvOn = true;
        System.out.println("TV is ON\n");
    }

    @Override
    public void off() {
        tvOn = false;
        System.out.println("TV is OFF\n");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Up");
        System.out.println("TV Volume is at " + volume + "\n");
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("YV Volume Down");
        System.out.println("TV Volume is at " + volume + "\n");
    }

}
