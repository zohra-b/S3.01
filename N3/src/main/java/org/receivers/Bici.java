package org.receivers;

public class Bici extends Vehicle {
    private final String NAME = "bici";

    public void arrencar(){
        System.out.println("La " + NAME + " ha arrencat");
    }

    public void accelerar(){
        System.out.println("La " + NAME + " ha accelerat");
    }

    public void frenar(){
        System.out.println("La " + NAME + " ha frenat");
    }

}

