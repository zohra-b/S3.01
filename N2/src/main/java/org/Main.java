package org;

import org.adresses.Address;
import org.factories.ContactDetailsFactory;
import org.factories.SpanishContactDetailsFactory;
import org.factories.TunisianContactDetailsFactory;
import org.phoneNumber.PhoneNumber;

public class Main {
    public static void main(String[] args) {
      PhoneBook phoneBook = new PhoneBook();

      Contact zohra = new Contact("Zohra", "Bellamine");
      ContactDetailsFactory tunisianFactory = new TunisianContactDetailsFactory();
      PhoneNumber tunNumber = tunisianFactory.createPhoneNumber("98456365");
      Address tunAddress = tunisianFactory.createAddress("Rue Aberahman Ibn Aouf", "10", "","", "El menzah VI", "1004", "Tunis","");

      zohra.setPhoneNumber(tunNumber);
      zohra.setAddress(tunAddress);

      Contact carlos = new Contact("Carlos", "Cuevas");
      ContactDetailsFactory spanishFactory = new SpanishContactDetailsFactory();
      PhoneNumber spNumber = spanishFactory.createPhoneNumber("633452548");
      Address spAddress = spanishFactory.createAddress("Carrer Lorda", "26", "1", "4", "","08005", "Barcelona", "Catalunya");

        carlos.setPhoneNumber(spNumber);
        carlos.setAddress(spAddress);

        phoneBook.addContact(zohra);
        phoneBook.addContact(carlos);

        phoneBook.showAll();

    }


}