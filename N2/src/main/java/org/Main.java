package org;

import org.adresses.SpanishAddress;
import org.adresses.TunisianAddress;
import org.phoneNumber.SpanishPhoneNumber;
import org.phoneNumber.TunisianPhoneNumber;

public class Main {
    public static void main(String[] args) {
      PhoneBook phoneBook = new PhoneBook();

      Contact zohra = new Contact("Zohra", "Bellamine");
      TunisianPhoneNumber tnNumber = new TunisianPhoneNumber();
      TunisianAddress tnAddress = new TunisianAddress("Rue Aberahman Ibn Aouf", "10", "","", "El menzah VI", "1004", "Tunis","");
      tnNumber.setNumber("98456365");

      zohra.setPhoneNumber(tnNumber);
      zohra.setAddress(tnAddress);

      Contact carlos = new Contact("Carlos", "Cuevas");

        SpanishPhoneNumber spNumber = new SpanishPhoneNumber();
        spNumber.setNumber("633452548");
        SpanishAddress spAddress = new SpanishAddress("Carrer Lorda", "26", "1", "4", "","08005", "Barcelona", "Catalunya");

        carlos.setPhoneNumber(spNumber);
        carlos.setAddress(spAddress);

        phoneBook.addContact(zohra);
        phoneBook.addContact(carlos);

        phoneBook.showAll();

    }


}