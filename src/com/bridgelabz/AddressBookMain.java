package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("....Welcome To Address Book Program....");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Add Contact \n2.Edit contact \n3.Delete contact \n4.Create Address Book \n5.Display Contact \n6.Exit");
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
                    addressBook.displayContact();
                    break;
                case 6:
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

