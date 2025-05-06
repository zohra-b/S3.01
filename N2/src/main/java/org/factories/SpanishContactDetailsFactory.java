package org.factories;

import org.adresses.Address;
import org.phoneNumber.PhoneNumber;
import org.adresses.SpanishAddress;
import org.phoneNumber.SpanishPhoneNumber;

public class SpanishContactDetailsFactory implements ContactDetailsFactory{
    @Override
    public Address createAddress(String street, String number, String floor, String door, String additionalInformation,String cp, String city, String administrativeArea) {
        return new SpanishAddress(street,  number,  floor,  door,additionalInformation,  cp,  city,  administrativeArea);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber();
    }
}
