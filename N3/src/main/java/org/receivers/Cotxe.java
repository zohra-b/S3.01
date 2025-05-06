package org.receivers;

public class Cotxe extends Vehicle  {
    private final String NAME = "cotxe";

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
