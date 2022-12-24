package org.example.Command;

/**
 * Time to make small small classes for feature/commands
 */
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    TurnTVOff(ElectronicDevice newDevice){
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
