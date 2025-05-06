package org;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    public void showAll(){
        for (Contact c : contacts){
            System.out.println(c + "\n");
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
