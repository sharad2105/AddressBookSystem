package com.addresbook;

import java.util.LinkedList;

public interface IMenu{

    LinkedList<Person> addPerson(LinkedList<Person> personList);
        LinkedList<Person> editPerson(LinkedList<Person> person) throws AddressBookException;

        void display(LinkedList<Person> person);

        LinkedList<Person> delete(LinkedList<Person> personList) throws AddressBookException;

        void sortRecords(LinkedList<Person> person);

        void searchInRecords(LinkedList<Person> person);

        boolean checkExists(String firstName, LinkedList<Person> person);


}