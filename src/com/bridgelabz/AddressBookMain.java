package com.bridgelabz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class AddressBookMain {

    public static void main(String[] args) throws IOException {

        System.out.println("....Welcome To Address Book Program....");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        Map<String,AddressBook> addressBookMap = new HashMap<String,AddressBook>();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Add Contact \n2.Edit contact \n3.Delete contact \n4.Create Address Book \n5.Duplicate check \n6.Search by Option \n7.Count by Options \n8.Sort Contact by name \n9.Write Data \n10.Read Data \n11.Display Contact \n12.Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    AddressBook.editContact();
                    break;
                case 3:
                    AddressBook.deleteContact();
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
                    addressBook.countByOptions();
                    break;
                case 8:
                    addressBook.sortContact();
                    break;
                case 9:
                   // FileIoServices.writeInTheFile();
                    FileIoServices fileIoServices = new FileIoServices();
                    fileIoServices.writeData();
                    break;
                case 10:
                    FileIoServices fileIoServices1 = new FileIoServices();
                    //FileIoServices.readFromTheFile();
                    fileIoServices1.readData();
                    break;
                case 11:
                    addressBook.displayContact();
                    break;
                case 12:
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

