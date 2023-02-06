package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("....Welcome To Address Book Program....");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Add Contact \n2.Edit contact \n3.Delete contact \n4.Create Address Book \n5.Duplicate check \n6.Search by Option \n7.Display Contact \n8.Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
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
                    addressBook.createAddressBook();
                    break;
                case 5:
                    System.out.println("Enter Firstname: ");
                    String firstName = sc.next();
                    addressBook.duplicateCheck(firstName);
                    break;
                case 6:
                    addressBook.searchByOptions();
                    break;
                case 7:
                    addressBook.displayContact();
                    break;
                case 8:
                    flag = false;
                    System.out.println("Exited Successfully........");
                    break;
                default:
                    System.out.println("Invalid Choice..");
                    break;
            }
        }
    }
}

