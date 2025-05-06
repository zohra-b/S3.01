package org.invoker;

import org.commands.Command;
import org.receivers.Vehicle;


public class Invoker {
    private Vehicle vehicle;

    public Invoker(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void submit(Command command){
        command.execute(vehicle);
    }
}
