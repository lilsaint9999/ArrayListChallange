import java.util.Scanner;

public class MobilePhone {
    private static Scanner scan = new Scanner(System.in);
    private static  Contacts contacts = new Contacts();


    public static void main(String[] args) {

        boolean quit = false;

        printMenu();

        while (!quit){
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContactList();
                    break;
                case 4:
                    searchForContact();
                    break;
                case 5:
                    quit =true;
                    break;
            }
        }


    }
    public static void printMenu(){
        System.out.println("Please select an option to: ");
        System.out.println("Press 0 to print the menu: ");
        System.out.println("Press 1 to print contacts: ");
        System.out.println("Press 2 to add a new Contact in your list: ");
        System.out.println("Press 3 to modify a contact: ");
        System.out.println("To exit press 4: ");
    }
    public static void addContact(){
        System.out.print("Enter a name  to create a contact: ");
        String name = scan.nextLine();
        contacts.storeContactName(name);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        contacts.storeContactPhoneNumber(number);
    }

    public static void printContacts(){
        contacts.printContacts();
    }

    public static void searchForContact(){
        System.out.println("Who are you looking for? ");
        String name = scan.nextLine();
        contacts.searchContact(name);
        System.out.println( name + " is in your contact list at position: " + (contacts.searchContact(name)+1));
    }
    public static void modifyContactList(){
        System.out.println("Enter which contact name U want to change: ");
        String existingName = scan.nextLine();

        System.out.println("Who is your new contact name");
        String newName = scan.nextLine();

        System.out.println("Enter his/her  number");
        int number = scan.nextInt();

        contacts.modifyContactList(existingName,newName,number);
    }
}
