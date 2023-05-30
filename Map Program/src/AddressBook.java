/* Collections Assignment -- Map Program
 * AddressBook Class
 * May 14, 2023
 * COP 2805C
 * Monica Berti
 * This program will create an electronic address book that will allow the user to add and remove addresses,
 * find addresses, see how many addresses there are in total, and to find an address by last name..
 */
import java.util.HashMap;

public class AddressBook {
    //create ConsoleIO object
    ConsoleIO menuPrompt = new ConsoleIO();

    //create addressBook
    public HashMap<String, Address> createMap() {
        HashMap<String, Address> addressBook = new HashMap<>();
        return addressBook;
    }

    //add address to addressBook
    public void addAddress(Address inputAddress, HashMap <String, Address> addressBook) {
        addressBook.put(inputAddress.getLastName(), inputAddress);
        menuPrompt.successfullyAdded();

    }

    //find address from addressBook
    public boolean toFindAddress (String lastName, HashMap <String, Address> addressBook) {
        if(addressBook.containsKey(lastName)) {
            menuPrompt.addressInAddressBook(lastName, addressBook);
            return true;
        }
        return false;
    }

    //delete address from addressBook
    public void deleteAddress(String lastName, HashMap <String, Address> addressBook) {
        addressBook.remove(lastName);
        menuPrompt.successfullyDeleted();
    }

    //list address count in addressBook
    public int countAddress(HashMap <String, Address> addressBook) {
        int sizeOfAddressBook = addressBook.size();
        return sizeOfAddressBook;
    }

}
