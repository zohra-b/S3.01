package org.commands;

import org.receivers.Vehicle;

public class Frenar implements Command{

    @Override
    public void execute(Vehicle vehicle) {
        vehicle.frenar();
    }
}
