package org.example.Command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args){

        ElectronicDevice newDevice = Remote.getDevice();

        TurnTVOn on = new TurnTVOn(newDevice);
        Buttons onPressed = new Buttons(on);
        onPressed.press();

        // -------------------------------------

        TurnTVOff off = new TurnTVOff(newDevice);
        Buttons offPressed = new Buttons(off);
        offPressed.press();

        // -------------------------------------

        VolumeUp up = new VolumeUp(newDevice);
        Buttons volumeUp = new Buttons(up);
        volumeUp.press();
        volumeUp.press();
        volumeUp.press();
        volumeUp.press();
        volumeUp.press();

        // -------------------------------------

        VolumeDown down = new VolumeDown(newDevice);
        Buttons volumeDown = new Buttons(down);
        volumeDown.press();

        //* Turing Everything off
        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(tv);
        devices.add(radio);

        TurnItAllOff allOff = new TurnItAllOff(devices);

        Buttons allClose = new Buttons(allOff);
        allClose.press();

        //*Doing the opposite thing...
        offPressed.pressUndo();
    }
}
