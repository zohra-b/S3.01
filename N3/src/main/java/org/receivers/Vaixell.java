package org.receivers;

public class Vaixell extends Vehicle  {
    private final String NAME = "vaixell";

    public void arrencar(){
        System.out.println("El " + NAME + " ha arrencat");
    }

    public void accelerar(){
        System.out.println("El " + NAME + " ha accelerat");
    }

    public void frenar(){
        System.out.println("El " + NAME + " ha frenat");
    }


}
