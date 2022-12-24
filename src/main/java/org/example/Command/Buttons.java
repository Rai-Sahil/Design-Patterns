package org.example.Command;

/**
 * This is the invoker/Button. It will call the execute method.
 * The invoker doesn't know shit, doesn't know what device or command is being used.
 * Now this button will be present in some kind of remote
 */
public class Buttons {

    Command theCommand;

    Buttons(Command newCommand) {
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndo(){
        theCommand.undo();
    }
}
