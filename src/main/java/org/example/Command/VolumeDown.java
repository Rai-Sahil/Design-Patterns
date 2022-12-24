package org.example.Command;

/**
 * Time to make small small classes for feature/commands
 */
public class VolumeDown implements Command {

    ElectronicDevice theDevice;

    VolumeDown(ElectronicDevice newDevice){
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeDown();
    }

    @Override
    public void undo() {
        theDevice.volumeUp();
    }
}
