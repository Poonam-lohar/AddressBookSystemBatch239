package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Scanner scanner = new Scanner(System.in);

    public Contact createContact() {

        Contact contact = new Contact();

        System.out.println("Enter First name: ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter Last name: ");
        contact.setLastName(scanner.next());
        System.out.println("Enter Address: ");
        contact.setAddress(scanner.next());
        System.out.println("Enter City: ");
        contact.setCity(scanner.next());
        System.out.println("Enter State: ");
        contact.setState(scanner.next());
        System.out.println("Enter zip code: ");
        contact.setZipCode(scanner.next());
        System.out.println("Enter Email: ");
        contact.setEmail(scanner.next());
        System.out.println("Enter Phone number: ");
        contact.setPhoneNumber(scanner.next());
        //System.out.println("Contact created Successfully.......");
        return contact;
    }
    public void addContact() {
        Contact contact = createContact();
        System.out.println(contact);
        System.out.println("Contact added Successfully...........");
    }
}
