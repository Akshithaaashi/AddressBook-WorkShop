package com.addressbook;
import java.util.Scanner;
public class AddressBook {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // Creating an object of Class AddressBook
           AddressBookList addressBook = new AddressBookList();

        boolean choice=true;
        while (choice) {
            System.out.println("\nChoose the option:\nPress '1' for Add\nPress '0' for Exit");
            int option=scan.nextInt();
            switch (option) {
                case 0: choice=false;
                    System.out.println("Exit out of AddressBook");
                    break;
                case 1: addressBook.addDetails();
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
