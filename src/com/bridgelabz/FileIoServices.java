package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import static com.bridgelabz.AddressBook.contactList;

public class FileIoServices {

    //private static final String FILE_PATH = "C:\\Users\\Suraj\\IdeaProjects\\add\\Batch239\\AddressBookSystemBatch239\\src\\com\\bridgelabz\\AddressBook.txt";

    private static final String FILE_PATH = "C:\\Users\\Suraj\\IdeaProjects\\add\\Batch239\\AddressBookSystemBatch239\\src\\com\\bridgelabz\\AddressBook.csv";
    public void writeData() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(String.valueOf(contactList));
            fileWriter.close();//close the writer

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Read data method
    public void readData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String store;
            while ((store = reader.readLine()) != null) {
                System.out.println(store);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}




