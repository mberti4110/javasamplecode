/* Collections Assignment -- Map Program
 * Main Class
 * May 14, 2023
 * COP 2805C
 * Monica Berti
 * This program will create an electronic address book that will allow the user to add and remove addresses,
 * find addresses, see how many addresses there are in total, and to find an address by last name..
 */
import java.util.HashMap;
public class AddressBookController {
    ConsoleIO menuPrompt = new ConsoleIO();
    AddressBook mainAddressBook = new AddressBook();


    //create address book
    public HashMap<String, Address> createAddressBook() {
        HashMap<String, Address> addressBook = mainAddressBook.createMap();
        return addressBook;
    }
    //run Menu from ConsoleIO class
    public void runMenu(HashMap<String, Address> addressBook) {

        //prompt user input for menu choice
        int menuChoice = 0;
        while (menuChoice != 6) {
            menuChoice = ConsoleIO.menuSelection();
            switch (menuChoice) {
                case 1:
                    Address newAddress = ConsoleIO.addressInputMenu();
                    mainAddressBook.addAddress(newAddress, addressBook);
                    break;
                case 2:
                    String toDeleteLastName = ConsoleIO.findAddressMenu();
                    boolean inAddress = mainAddressBook.toFindAddress(toDeleteLastName, addressBook);
                    if (inAddress == true) {
                        mainAddressBook.deleteAddress(toDeleteLastName, addressBook);
                    }
                    break;
                case 3:
                    String toFindLastName = ConsoleIO.findAddressMenu();
                    mainAddressBook.toFindAddress(toFindLastName, addressBook);
                    break;
                case 4:
                    int addressBookSize = mainAddressBook.countAddress(addressBook);
                    ConsoleIO.sizeOfAddressBookOutput(addressBookSize);
                    break;
                case 5:
                    ConsoleIO.displayAllAddresses(addressBook);
                    break;
                case 6:
                    break;
            }
        }
    }

}
