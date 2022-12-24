package org.example.Command;

/**
 * Every single command have to implement this.
 */
public interface Command {

    void execute();

    //Do the opposite of everything
    void undo();
}
