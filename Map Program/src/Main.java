/* Collections Assignment -- Map Program
 * Main Class
 * May 14, 2023
 * COP 2805C
 * Monica Berti
 * This program will create an electronic address book that will allow the user to add and remove addresses,
 * find addresses, see how many addresses there are in total, and to find an address by last name..
 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AddressBookController menuPrompt = new AddressBookController();
        //create map of address
        HashMap<String, Address> addressBook = menuPrompt.createAddressBook();
        //run menu options
        menuPrompt.runMenu(addressBook);
    }
}