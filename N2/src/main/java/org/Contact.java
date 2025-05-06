package org;

import org.adresses.Address;
import org.phoneNumber.PhoneNumber;

public class Contact {
    private String name;
    private String surname;
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                 name + ' ' + surname +
                "\nAddress:\n" + address +
                "\nPhone Number : " + phoneNumber +
                '}';
    }
}
