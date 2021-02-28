package com.addresbook;

public class AddressBookSystem {
    public static void main(String[] args) {
        int choice, i = 0;
        final Menu menu = new Menu();
        while (i == 0) {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Delete Person     ");
            System.out.println("3: Edit Person     ");
            System.out.println("4: Display.....     ");
            System.out.println("5: Exit		       \n");
            System.out.println("--- Enter Your Choice ---");
            choice = GetData.getIntValue();
            switch (choice) {
                case 1:
                    menu.addPerson();
                    break;
                case 2:
                    menu.editPerson();
                    break;
                case 3:
<<<<<<< HEAD
                    menu.delete();
=======
                    menu.delete();;
>>>>>>> UC4-Delete
                    break;
                case 4 :
                    menu.display();
                    break;
                case 5 :
                    i=1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}