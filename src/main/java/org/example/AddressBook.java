package org.example;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    // Constructor
    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the address book.");
        } else {
            System.out.println("\nContacts in Address Book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
