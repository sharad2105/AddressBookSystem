package com.addresbook;

public class AddressBookSystem {
    public static void main(String[] args) {
        String firstName,lastName,address,city,state,zipCode,phoneNumber;
        System.out.println("Welcome To Address Book");
        System.out.println("Enter First Name");
        firstName=GetData.getStringValue();
        System.out.println("Enter Last Name");
        lastName=GetData.getStringValue();
        System.out.println("Enter Address");
        address=GetData.getStringValue();
        System.out.println("Enter City");
        city=GetData.getStringValue();
        System.out.println("Enter State");
        state=GetData.getStringValue();
        System.out.println("Enter Zip");
        zipCode=GetData.getStringValue();
        System.out.println("Enter phone number");
        phoneNumber=GetData.getStringValue();
    }
}
