package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<Contact>();
    HashMap<String, ArrayList<Contact>> hashmap = new HashMap<>();

    static AddressBook addressBook = new AddressBook();

    Scanner scanner = new Scanner(System.in);

    static ArrayList<Contact> currentAddressBook;

    static String currentAddressBookName;

    //UC1
    public Contact createContact() {

        Contact contact = new Contact();

        System.out.print("Enter First name: ");
        contact.setFirstName(scanner.next());
        System.out.print("Enter Last name: ");
        contact.setLastName(scanner.next());
        System.out.print("Enter Address: ");
        contact.setAddress(scanner.next());
        System.out.print("Enter City: ");
        contact.setCity(scanner.next());
        System.out.print("Enter State: ");
        contact.setState(scanner.next());
        System.out.print("Enter zip code: ");
        contact.setZipCode(scanner.next());
        System.out.print("Enter Email: ");
        contact.setEmail(scanner.next());
        System.out.print("Enter Phone number: ");
        contact.setPhoneNumber(scanner.next());
        //System.out.println("Contact created Successfully.......");
        //contactList.add(contact);
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

    public void deleteContact() {

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
                System.out.println(contact);
            }
        }
    }

    public void createAddressBook() {
        int option = 1;
        while (option == 1) {
            System.out.println("Choose an Option According To Your Preference: ");
            System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");

            switch (scanner.nextInt()) {
                //Switch Case For Creating New Address Book
                case 1:
                    System.out.println("Enter the name of address book: ");
                    String address_name = scanner.next();

                    // condition to check for uniqueness of address book.
                    if (hashmap.containsKey(address_name)) {
                        System.out.println("Address book name exits, enter different name");
                        break;
                    }

                    ArrayList<Contact> newAddressBook = new ArrayList<>();
                    contactList = newAddressBook;
                    int choice = 1;
                    while (choice == 1) {
                        System.out.println("Choose an Option According To Your Preference: ");
                        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display Contact\n5.Exit");

                        switch (scanner.nextInt()) {
                            case 1:
                                addressBook.addContact();
                                break;
                            case 2:
                                addressBook.editContact();
                                break;
                            case 3:
                                addressBook.deleteContact();
                                break;
                            case 4:
                                addressBook.displayContact();
                                break;
                            default:
                                System.out.println("Exited From Address Book");
                                break;
                        }
                        hashmap.put(address_name, contactList);
                        System.out.println(hashmap);
                        choice = 0;
                    }
                    break;

                //Switch Case For Editing Existing Address Book
                case 2:
                    System.out.println("Enter the name of address book: ");
                    String oldAddressBook = scanner.next();

                    // condition to check whether address book exists or no.
                    if (hashmap.containsKey(oldAddressBook)) {

                        ArrayList<Contact> old_address_book = new ArrayList<>();
                        contactList = old_address_book;
                        contactList = hashmap.get(oldAddressBook);
                        int choice1 = 1;
                        while (choice1 == 1) {
                            System.out.println("Choose an Option According To Your Preference: ");
                            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display contact.\n5.Exit");
                            switch (scanner.nextInt()) {
                                case 1:
                                    addressBook.addContact();
                                    break;
                                case 2:
                                    addressBook.editContact();
                                    break;
                                case 3:
                                    addressBook.deleteContact();
                                    break;
                                case 4:
                                    addressBook.displayContact();
                                    break;
                                default:
                                    System.out.println("Exited From Address Book");
                                    break;
                            }
                            hashmap.put(oldAddressBook, contactList);
                            System.out.println(hashmap);
                            choice1 = 0;
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                    break;

                //Switch Case For Displaying All Address Book
                case 3:
                    System.out.println(hashmap);
                    break;

                default:
                    System.out.println("Exited From Address Book Management System");
                    option = 0;
            }
        }
    }
}
    //void displayContact(ArrayList addressBook) {

        //String addressBookName = scanner.next();
        //addressBookList.put(addressBookName, contactList);
        //System.out.println(addressBookList);
        //System.out.println("Contacts: ");
       // for (Object p : addressBook) {
         //   Contact contact = (Contact) p;
           // System.out.println(contact);

