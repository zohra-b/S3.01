/*
package org;

import java.util.Scanner;

public class ApplicationManager {
    PhoneBook phoneBook = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    String country;
    String name;
    String surname;
    ContactDetailsFactory factory;

    public void run() {
        do {

            System.out.println(
                    "Insert 'exit' to exit the program or insert contact's name to create a contact");
            name = sc.nextLine();
            System.out.println("Insert contact's surname");
            surname = sc.nextLine();

            System.out.println("Insert contact's country");
            country = sc.nextLine();

            Contact contact = new Contact(name, surname);
            System.out.println("Contact succesfully created");

            if (country.equalsIgnoreCase("España")) {
                factory = new SpanishContactDetailsFactory();

            } else if (country.equalsIgnoreCase("Tunisia")) {
                factory = new TunisianContactDetailsFactory();
            } else {
                System.out.println("you must enter a valid country");
            }


            Address address = factory.createAddress();
            PhoneNumber phoneNumber = factory.createPhoneNumber();

            System.out.println("Creating contact phone number : Insert contact's phoneNumber");
            phoneNumber.setPhoneNumber(sc.nextLine());

            System.out.println("Creating contact address. Insert contact's address");

            phoneBook.showAll();
        } while (!"exit".equalsIgnoreCase(sc.nextLine()));
    }








}
*/
