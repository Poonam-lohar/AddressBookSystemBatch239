package com.bridgelabz;

public class AddressBook {

    public void createContact() {

        Contact contact = new Contact("Poonam","Lohar","Shirol","Kolhapur","maharashtra"," 416103","poonam98","7058835985");

        System.out.println("First name: "+contact.getFirstName());
        System.out.println("Last name: "+contact.getLastName());
        System.out.println("Address: "+contact.getAddress());
        System.out.println("City: "+contact.getCity());
        System.out.println("State: "+contact.getState());
        System.out.println("zip code: "+contact.getZipCode());
        System.out.println("Email: "+contact.getEmail());
        System.out.println("Phone number: "+contact.getPhoneNumber());
        System.out.println("Contact created Successfully.......");

    }

}
