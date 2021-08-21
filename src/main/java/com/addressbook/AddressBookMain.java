package com.addressbook;

public class AddressBookMain {

    public String firstname, lastname;
    public String address, city, state;
    public long zip;
    public long phoneNumber;
    public String email;

    /**
     * Parameterized constructor is created.
     */
    public AddressBookMain(String firstname, String lastname, String address, String city,
                           String state, long zip, long phoneNo, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNo;
        this.email = email;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNo(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method use to print all the value.
     */
    @Override
    public String toString() {
        return " First Name:" + firstname + " Last Name:" + lastname + " Address:" + address + " City:" + city
                + " State:" + state + " Zip:" + zip + " PhoneNumber:" + phoneNumber + " EmailId:" + email + '\n';
    }
}