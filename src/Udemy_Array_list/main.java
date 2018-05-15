package Udemy_Array_list;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhones mobilePhone = new MobilePhones();

    public static void main(String[] args) {
        boolean quit = false;

        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (5 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.SortByName();
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;



                case 5:
                    printActions();
                    break;
            }

        }
    }






    private static void addNewContact(){
        System.out.println("Enter Contact Name: ");
        String x =scanner.nextLine();
        System.out.println("Enter Contact Number: ");
        String y = scanner.nextLine();
        Contacts contacts = new Contacts(x,y);
        mobilePhone.addContact(contacts);
    }
    private static void updateContact(){
        System.out.println("Enter old Contact Name: ");
        String x =scanner.nextLine();
        System.out.println("Enter old Contact Number: ");
        String y = scanner.nextLine();
        Contacts oldcontacts = new Contacts(x,y);
        System.out.println("Enter new Contact Name: ");
        String z =scanner.nextLine();
        System.out.println("Enter new Contact Number: ");
        String g = scanner.nextLine();
        Contacts newcontacts = new Contacts(z,g);
        mobilePhone.modify(oldcontacts, newcontacts);

    }
    private static void removeContact(){
        System.out.println("Enter Contact Name: ");
        String x =scanner.nextLine();
        System.out.println("Enter Contact Number");
        String y = scanner.nextLine();
        Contacts contacts = mobilePhone.queryContact(x);
        if(contacts == null){
            System.out.println("Not found");
        }
        mobilePhone.remove(contacts);
    }


    public static void printContacts(){
        mobilePhone.printContacts();
    }









    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
