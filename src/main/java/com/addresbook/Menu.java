package com.addresbook;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Person> PERSON = new ArrayList<Person>();

    public void addPerson()
    {
        final String firstName, lastName, address, city, state, phoneNumber,zipCode;

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
        System.out.print("Enter zipCode : ");
        zipCode = GetData.getStringValue();
        System.out.print("Enter state : ");
        state = GetData.getStringValue();

        PERSON.add(new Person(firstName,lastName,address,city,state,phoneNumber,zipCode));
    }


    public void display()
    {
        for(Person person: PERSON)
        {
            System.out.println(person);
        }

    }
    public void editPerson()
    {
        int id,choice = 0, i=0;
        String firstName,lastName,address,city,state,phoneNumber,zipCode;
        for(Person person: PERSON)
        {
            System.out.println("ID: #"+PERSON.indexOf(person)+" : "+person);
        }
        System.out.print("\nEnter ID to Edit Contact : ");
        id = GetData.getIntValue();
        System.out.println(PERSON.get(id));
        while(i==0) {
            System.out.println("What You Want to edit...\n"
                    + "\t1: Address\n"
                    + "\t2: city\n"
                    + "\t3: State\n"
                    + "\t4: Phone\n"
                    + "\t5: Zip Code\n"
                    + "\t6. Save And Exit\n");
            choice = GetData.getIntValue();
            switch (choice) {
                case 1:
                    System.out.print("Enter new Street : ");
                    address = GetData.getStringValue();
                    PERSON.get(id).setAddress(address);
                    break;
                case 2:
                    System.out.print("Enter new City : ");
                    city = GetData.getStringValue();
      gi              PERSON.get(id).setCity(city);
                    break;
                case 3:
                    System.out.print("Enter new State : ");
                    state = GetData.getStringValue();
                    PERSON.get(id).setState(state);
                    break;
                case 4:
                    System.out.print("Enter new Phone : ");
                    phoneNumber = GetData.getStringValue();
                    PERSON.get(id).setPhoneNumber(phoneNumber);
                    break;
                case 5:
                    System.out.print("Enter new Zip Code : ");
                    zipCode = GetData.getStringValue();
                    PERSON.get(id).setZipCode(zipCode);
                    break;
                case 6:
                    i=1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
            }
            System.out.println(PERSON.get(id));
        }
    }
}
