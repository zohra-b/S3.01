package org.receivers;

public class Avio extends Vehicle {
    private final String NAME = "avió";

    public void arrencar(){
        System.out.println("L' " + NAME + " ha arrencat");
    }

    public void accelerar(){
        System.out.println("L' " + NAME + " ha accelerat");
    }

    public void frenar(){
        System.out.println("L' " + NAME + " ha frenat");
    }

}

