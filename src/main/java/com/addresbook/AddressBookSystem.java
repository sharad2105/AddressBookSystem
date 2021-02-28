package com.addresbook;

import java.io.IOException;
import java.util.LinkedList;

class AddressBook {
    public static void main(String[] args) throws AddressBookException, IOException {
        final String JSON_SIMPLE_FILE_PATH = "src/main/resources/JSonSimpleAddressBook.json";
        final String OPEN_CSV_FILE_PATH = "src/main/resources/CSVAddressBook.csv";
        final int jsonSampleOperation = 1, openCSVOperation = 2;
        int operations = 0, flag = 0;
        String filePath = null;
        LinkedList<Person> personList;
        FileOperations fileOperations = new FileOperations();
        final Menu addressBookService = new Menu();

        System.out.println("Select Below Operations:\n1. JSON SAMPLE\n2. OPEN CSV \n");
        int option = GetData.getIntValue();
        switch (option) {
            case 1:
                filePath = JSON_SIMPLE_FILE_PATH;
                operations = jsonSampleOperation;
                break;
            case 2:
                filePath = OPEN_CSV_FILE_PATH;
                operations = openCSVOperation;
                break;
        }
        while (flag == 0) {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person");
            System.out.println("2: Display Records");
            System.out.println("3: Edit Person");
            System.out.println("4: Delete Person");
            System.out.println("5: Sort");
            System.out.println("6: Search");
            System.out.println("7: Exit\n");
            System.out.println("--- Enter Your Choice ---");
            int choice = GetData.getIntValue();
            switch (choice) {
                case 1:
                    personList = fileOperations.getDataInList(filePath, operations);
                    personList = addressBookService.addPerson(personList);
                    fileOperations.convertToFile(personList, filePath, operations);
                    break;
                case 2:
                    LinkedList<Person> person = fileOperations.getDataInList(filePath, operations);
                    addressBookService.display(person);
                    break;
                case 3:
                    personList = fileOperations.getDataInList(filePath, operations);
                    personList = addressBookService.editPerson(personList);
                    fileOperations.convertToFile(personList, filePath, operations);

                    break;
                case 4:
                    personList = fileOperations.getDataInList(filePath, operations);
                    personList = addressBookService.delete(personList);
                    fileOperations.convertToFile(personList, filePath, operations);
                    break;
                case 5:
                    personList = fileOperations.getDataInList(filePath, operations);
                    addressBookService.sortRecords(personList);   personList = fileOperations.getDataInList(filePath, operations);
                    addressBookService.searchInRecords(personList);
                    break;
                case 6:
                    personList = fileOperations.getDataInList(filePath, operations);
                    addressBookService.searchInRecords(personList);
                    break;
                case 7:
                    flag = 1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}