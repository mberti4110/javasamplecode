/* Collections Assignment -- Map Program
 * ConsoleIO Class
 * May 14, 2023
 * COP 2805C
 * Monica Berti
 * This program will create an electronic address book that will allow the user to add and remove addresses,
 * find addresses, see how many addresses there are in total, and to find an address by last name..
 */
import java.util.HashMap;
import java.util.Scanner;

public class ConsoleIO {
    //create scanner instance
    static Scanner input = new Scanner(System.in);

    //display Menu Window
    public static int menuSelection() {
        //create scanner instance
        Scanner input = new Scanner(System.in);
        boolean validMenuInput = false;
        int menuOption = 0;

        while (!validMenuInput) {
            System.out.println("Please select the operation you wish to perform: ");
            System.out.println("1. Add Address");
            System.out.println("2. Delete Address");
            System.out.println("3. Find Address");
            System.out.println("4. List Address Count");
            System.out.println("5. List All Addresses");
            System.out.println("6. Quit");
            menuOption = input.nextInt();
            input.nextLine();

            if (menuOption >= 1 && menuOption <= 6) {
                validMenuInput = true;
            } else {
                System.out.println("Please enter a valid integer between 1 and 6.");
            }
        }
        return menuOption;
    }

    //address input menu
    public static Address addressInputMenu() {
        //prompt user for firstName
        System.out.println("Please enter first name: ");
        String firstName = input.nextLine();

        //prompt user for lastName
        System.out.println("Please enter last name: ");
        String lastName = input.nextLine();

        //prompt user for street address
        System.out.println("Please enter street address: ");
        String streetAddress = input.nextLine();

        Address addressInput = new Address(firstName,lastName,streetAddress);

        return addressInput;
    }

    //output if address added
    public static void successfullyAdded() {
        int returnMainMenu = 0;
        do {
            System.out.println("Address Added. Press 1 to go to Main Menu");
            returnMainMenu = input.nextInt();
            if (returnMainMenu == 1) {
                input.nextLine();
                return;
            }
            System.out.println("Please press 1 to go to Main Menu");
        } while (returnMainMenu != 1);
    }

    //output if address deleted
    public static void successfullyDeleted() {
        int returnMainMenu = 0;
        do {
            System.out.println("Address Deleted. Press 1 to go to Main Menu");
            returnMainMenu = input.nextInt();
            if (returnMainMenu == 1) {
                input.nextLine();
                return;
            }
            System.out.println("Please press 1 to go to Main Menu");
        } while (returnMainMenu != 1);
    }

    //remove address menu, search by last name
    public static String findAddressMenu() {
        //prompt user for firstName
        System.out.println("Please enter last name to find address: ");
        String lastName = input.nextLine();

        return lastName;
    }

    //output if address in addressBook
    public static void addressInAddressBook(String lastName, HashMap<String, Address> addressBook) {
        if (addressBook.containsKey(lastName)) {
        Address requestedAddress = addressBook.get(lastName);
        System.out.println("Address found in Address Book for Last Name: " + lastName);
        System.out.println("Address: " + requestedAddress.toString());
    } else {
        System.out.println("Address not found for Last Name: " + lastName);
    }
    }

    //output size of addressBook
    public static void sizeOfAddressBookOutput(int sizeOfAddressBook) {
            System.out.println("The amount of addresses found in the Address Book is: " + sizeOfAddressBook + " address(es).");
    }

    //output values in addressBook
    public static void displayAllAddresses(HashMap<String, Address> addressBook) {
        System.out.println("Address Book:");
        System.out.println(addressBook);
        System.out.println();
    }
}
