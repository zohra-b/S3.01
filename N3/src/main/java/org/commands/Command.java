package org.commands;

import org.receivers.Vehicle;

public interface Command {
    void execute(Vehicle vehicle);

}
