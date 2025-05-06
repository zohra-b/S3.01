package org.commands;

import org.receivers.Vehicle;

public class Accelerar implements Command{



    @Override
    public void execute(Vehicle vehicle) {
        vehicle.accelerar();
    }
}
