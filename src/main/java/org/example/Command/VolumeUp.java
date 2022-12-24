package org.example.Command;

/**
 * Time to make small small classes for feature/commands
 */
public class VolumeUp implements Command {

    ElectronicDevice theDevice;

    VolumeUp(ElectronicDevice newDevice){
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
