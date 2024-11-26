package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contactList;

    public AddressBook() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts in the address book.");
        } else {
            System.out.println("\nContacts in Address Book:");
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }
    public void editContact(String name, Scanner scanner) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("\nEditing details for: " + contact);
                System.out.println("Enter new details (leave blank to keep existing):");

                System.out.print("First Name (" + contact.getFirstName() + "): ");
                String newFirstName = scanner.nextLine();
                if (!newFirstName.isEmpty()) {
                    contact.setFirstName(newFirstName);
                }

                System.out.print("Last Name (" + contact.getLastName() + "): ");
                String newLastName = scanner.nextLine();
                if (!newLastName.isEmpty()) {
                    contact.setLastName(newLastName);
                }

                System.out.print("Address (" + contact.getAddress() + "): ");
                String newAddress = scanner.nextLine();
                if (!newAddress.isEmpty()) {
                    contact.setAddress(newAddress);
                }

                System.out.print("City (" + contact.getCity() + "): ");
                String newCity = scanner.nextLine();
                if (!newCity.isEmpty()) {
                    contact.setCity(newCity);
                }

                System.out.print("State (" + contact.getState() + "): ");
                String newState = scanner.nextLine();
                if (!newState.isEmpty()) {
                    contact.setState(newState);
                }

                System.out.print("ZIP (" + contact.getZip() + "): ");
                String newZip = scanner.nextLine();
                if (!newZip.isEmpty()) {
                    contact.setZip(newZip);
                }

                System.out.print("Phone Number (" + contact.getPhoneNumber() + "): ");
                String newPhoneNumber = scanner.nextLine();
                if (!newPhoneNumber.isEmpty()) {
                    contact.setPhoneNumber(newPhoneNumber);
                }

                System.out.print("Email (" + contact.getEmail() + "): ");
                String newEmail = scanner.nextLine();
                if (!newEmail.isEmpty()) {
                    contact.setEmail(newEmail);
                }

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact with the name \"" + name + "\" not found.");
    }
}
