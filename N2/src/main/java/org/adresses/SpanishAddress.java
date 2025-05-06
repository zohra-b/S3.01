package org.adresses;

public class SpanishAddress implements Address{
    private String street;
    private String number;
    private String floor;
    private String door;
    private String additionalInformation;
    private String cp;
    private String city;
    private String administrativeArea;

    public SpanishAddress(String street, String number, String floor, String door, String additionalInformation, String cp, String city, String administrativeArea) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
        this.additionalInformation = additionalInformation;
        this.cp = cp;
        this.city = city;
        this.administrativeArea = administrativeArea;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setCp(String cp) {
        if (cp == null || !cp.matches("\\d{5}") ){
            throw new IllegalArgumentException("Spanish postal code contain 5 digits");
        }
        this.cp = cp;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }



    @Override
    public String toString() {
        return  street + " " + number +
                "\n " + floor + " - " + door +
                "\n " + additionalInformation +
                "\n " + cp + " " + city +
                "\n " + administrativeArea +
                "\n España";

    }
}
