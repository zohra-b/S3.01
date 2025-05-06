package org.commands;

import org.receivers.Vehicle;

public class Arrencar implements Command {


    @Override
    public void execute(Vehicle vehicle) {
        vehicle.arrencar();
    }
}
