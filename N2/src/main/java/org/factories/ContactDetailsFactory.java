package org.factories;

import org.adresses.Address;
import org.adresses.SpanishAddress;
import org.phoneNumber.PhoneNumber;

public interface ContactDetailsFactory {

    Address createAddress(String street, String number, String floor, String door, String additionalInformation,String cp, String city, String administrativeArea);

    PhoneNumber createPhoneNumber(String number);

}
