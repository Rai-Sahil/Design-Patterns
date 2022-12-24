package org.example.Command;

/**
 * Time to make small small classes for feature/commands
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    TurnTVOn(ElectronicDevice newDevice){
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
