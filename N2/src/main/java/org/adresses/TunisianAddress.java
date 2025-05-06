package org.adresses;

public class TunisianAddress implements Address {
    private String street;
    private String number;
    private String floor;
    private String door;
    private String additionalInformation;
    private String cp;
    private String city;
    private String administrativeArea;


    public TunisianAddress(String street, String number, String floor, String door, String additionalInformation, String cp, String city, String administrativeArea) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
        this.additionalInformation = additionalInformation;
        this.cp = cp;
        this.city = city;
        this.administrativeArea = administrativeArea;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setCp(String cp) {
        if (cp == null || !cp.matches("\\d{4}")) {
            throw new IllegalArgumentException("Tunisian postal code contain 5 digits");
        }
        this.cp = cp;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public String toString() {
        return number + ", " + street +
                "\n " + floor + " étage" +
                "\n" + additionalInformation +
                "\n " + cp + " " + city +
                "\n Tunisie";

    }
}
