package com.addresbook;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Person> p = new ArrayList<Person>();

    public void addPerson()
    {
        final String firstName, lastName, address, city, state, phoneNumber, zipCode;

        System.out.print("Enter First Name : ");
        firstName = GetData.getStringValue();
        System.out.print("Enter Last Name : ");
        lastName = GetData.getStringValue();
        System.out.print("Enter Phone Number : ");
        phoneNumber = GetData.getStringValue();
        System.out.print("Enter Address : ");
        address = GetData.getStringValue();
        System.out.print("Enter city : ");
        city = GetData.getStringValue();
        System.out.print("Enter zip : ");
        zipCode = GetData.getStringValue();
        System.out.print("Enter state : ");
        state = GetData.getStringValue();

        p.add(new Person(firstName,lastName,address,city,state,phoneNumber,zipCode));
    }


    public void display()
    {
        for(Person p1: p)
        {
            System.out.println(p1);
        }

    }
}
