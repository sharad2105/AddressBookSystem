package com.addresbook;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    List<Person> PERSON = new ArrayList<Person>();

    public static void searchByCity(List<Person> person) {
        String search;
        List<Person> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = GetData.getStringValue();
        int flag = 0;
        for (Person p : person) {
            if (p.getCity().equalsIgnoreCase(search)) {
                flag = 1;
                matches.add(p);
            }
        }
        if (flag == 1) {
            System.out.println("...Match Found...");
            for (Person p : matches) {
                System.out.println(p);
            }
        } else {
            System.out.println("Match Not Found!!!");
        }
    }

    public static void searchByState(List<Person> person) {
        String search;
        int flag = 0;
        List<Person> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = GetData.getStringValue();
        for (Person p : person) {
            if (p.getState().equalsIgnoreCase(search)) {
                flag = 1;
                matches.add(p);
            }
        }
        if (flag == 1) {
            System.out.println("...Match Found...");
            for (Person p : matches) {
                System.out.println(p);
            }
        } else {
            System.out.println("Match Not Found!!!");
        }
    }

    public static void sortByName(List<Person> person) {
        person.sort(Person.firstNameSorting);
        person.forEach(System.out::println);
    }

    public static void sortByCity(List<Person> person) {
        person.sort(Person.citySorting);
        person.forEach(System.out::println);
    }

    public static void sortByState(List<Person> person) {
        person.sort(Person.stateSorting);
        person.forEach(System.out::println);
    }

    public static void sortByZipCode(List<Person> person) {
        person.sort(Person.zipSorting);
        person.forEach(System.out::println);
    }


    public void addPerson() {
        int i = 0;
        String firstName = null;
        final String lastName, address, city, state, phoneNumber, zipCode;
        while (i == 0) {
            System.out.print("Enter First Name : ");
            firstName = GetData.getStringValue();
            if (checkExists(firstName)) { //calling checkExits() method to check Fname already exists or not.
                System.out.println("Person Name Already Exists!!\nPlease enter different name...");
            } else {
                i = 1;
            }
        }

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

        PERSON.add(new Person(firstName, lastName, address, city, state, phoneNumber, zipCode));
    }


    public void display() {
        if (PERSON.isEmpty()) {
            System.out.println("No Records!!!");
        } else {
            for (Person person : PERSON) {
                System.out.println(person);
            }
        }

    }

    public void editPerson() {
        int id, choice = 0, i = 0;
        String firstName, lastName, address, city, state, phoneNumber, zipCode;
        for (Person person : PERSON) {
            System.out.println("ID: #" + PERSON.indexOf(person) + " : " + person);
        }
        System.out.print("\nEnter ID to Edit Contact : ");
        id = GetData.getIntValue();
        System.out.println(PERSON.get(id));
        while (i == 0) {
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
                    sortByName(personList);
                    break;
                case 2:
                    sortByCity(personList);
                    break;
                case 3:
                    sortByState(personList);
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
                    i = 1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
            }
            System.out.println(PERSON.get(id));
        }
    }

    public void delete() {
        int id;
        for (Person p : PERSON) {
            System.out.println("ID: #" + PERSON.indexOf(p) + " : " + p);
        }
        System.out.print("\nEnter #ID to delete Contact : ");
        id = GetData.getIntValue();
        PERSON.remove(id);
    }

    public void sortRecords() {

        System.out.println("Sort By...\n"
                + "1: First Name\n"
                + "2: City\n"
                + "3: State\n"
                + "4: Zip Code\n"
                + "5: Back");
        int choice = GetData.getIntValue();
        switch (choice) {
            case 1:
                searchByCity(personList);
                break;
            case 2:
                searchByState(personList);
                break;
            case 3:
                i = 1;
                break;

            default:
                System.out.println("Please Enter Valid Option...");
        }
    }
}
