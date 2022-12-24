package org.example.Command;

/**
 * Second Device
 */
public class Radio implements ElectronicDevice{

    private int volume = 0;
    private boolean radioOn = false;

    @Override
    public void on() {
        radioOn = true;
        System.out.println("radio is ON\n");
    }

    @Override
    public void off() {
        radioOn = false;
        System.out.println("radio is OFF\n");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Up");
        System.out.println("radio Volume is at " + volume + "\n");
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Down");
        System.out.println("radio Volume is at " + volume + "\n");
    }
}
