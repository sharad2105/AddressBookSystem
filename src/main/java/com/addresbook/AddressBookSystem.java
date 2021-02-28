package com.addresbook;

public class AddressBookSystem {
    public static void main(String[] args) {
        int choice, i = 0;
        final Menu menu = new Menu();
        while (i == 0) {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Edit Person     ");
            System.out.println("4: Delete Person     ");
            System.out.println("5: Sort     ");
            System.out.println("6: Exit		       \n");
            System.out.println("--- Enter Your Choice ---");
            choice = GetData.getIntValue();
            switch (choice) {
                case 1:
                    menu.addPerson();
                    break;
                case 2:
                    menu.display();
                    break;
                case 3:
                    menu.editPerson();
                    break;
                case 4 :
                    menu.delete();
                    break;
                case 5 :
                    menu.sortRecords();
                    break;
                case 6 :
                    i=1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}