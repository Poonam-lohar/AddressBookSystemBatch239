package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    List<Contact> contactList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    //UC1
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

    //UC2
    public void addContact() {
        Contact contact = createContact();
        System.out.println(contact);
        contactList.add(contact);
        System.out.println("Contact added Successfully...........");
    }
    //UC3

    public void editContact() {
        System.out.println("Edit contact by First name: ");
        String name = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(name)) {
                System.out.println("Edit by: \n1.last name\n2.Address \n3.City \n4.State \n5.Zip code \n6.Email \n7.Phone number");
                int edit = scanner.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter last name: ");
                        contactList.get(i).setLastName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter address: ");
                        contactList.get(i).setAddress(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter city: ");
                        contactList.get(i).setCity(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter State: ");
                        contactList.get(i).setState(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter Zip code: ");
                        contactList.get(i).setZipCode(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Email: ");
                        contactList.get(i).setEmail(scanner.next());
                        break;
                    case 7:
                        System.out.println("Enter phone number: ");
                        contactList.get(i).setPhoneNumber(scanner.next());
                        break;
                }
                System.out.println("Edited List is....");
                System.out.println(contactList);
            } else {
                System.out.println("Enter valid name: ");

            }
        }
    }
    //UC4

    public void deleteDetails() {

        System.out.println("Confirm the first name to delete contacts: ");

        String ConfirmName = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(ConfirmName)) {
                contactList.remove(i);
                System.out.println("Contact Deleted Successfully.....");
                System.out.println("List after removing details: " + contactList);
            } else {
                System.out.println("Enter valid first name: ");
            }
        }
    }

    void displayContact() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts to display");
        } else {
            for (Contact contact : contactList) {
                System.out.println(contactList);
            }
        }
    }
}