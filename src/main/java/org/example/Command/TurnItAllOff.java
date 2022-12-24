package org.example.Command;

import java.util.List;

public class TurnItAllOff implements Command{

    List<ElectronicDevice> theDevice;

    TurnItAllOff(List<ElectronicDevice> newDevices){
        theDevice = newDevices;
    }

    @Override
    public void execute() {
        for(ElectronicDevice device : theDevice){
            device.off();
        }
    }

    @Override
    public void undo() {
        for(ElectronicDevice device : theDevice){
            device.on();
        }
    }
}
