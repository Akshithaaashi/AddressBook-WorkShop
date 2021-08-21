package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBookList{
    private static Scanner scanner = new Scanner(System.in);
    public List<AddressBookMain> personList = new ArrayList<AddressBookMain>();
    /**
     * Asks the user for details of the person and storing in person List
     */
    public void addDetails() {

        System.out.print("\nEnter First name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last name : ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address : ");
        String address = scanner.nextLine();

        System.out.print("Enter City name : ");
        String city = scanner.nextLine();

        System.out.print("Enter State name : ");
        String state = scanner.nextLine();

        System.out.print("Enter ZIP Code : ");
        long zip = scanner.nextLong();

        System.out.print("Enter Phone Number : ");
        long mobileNo = scanner.nextLong();

        System.out.print("Enter E-Mail ID : ");
        String email = scanner.nextLine();

        // Adding the details into list
        AddressBookMain person = new AddressBookMain(firstName, lastName, address, city, state, zip, mobileNo, email);
        personList.add(person);
        System.out.println("Contact added successfully");
    }

}