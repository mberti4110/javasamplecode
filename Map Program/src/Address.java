/* Collections Assignment -- Map Program
 * Address Class
 * May 14, 2023
 * COP 2805C
 * Monica Berti
 * This program will create an electronic address book that will allow the user to add and remove addresses,
 * find addresses, see how many addresses there are in total, and to find an address by last name..
 */
public class Address {
    //initiate variables
    String firstName;
    String lastName;
    String streetAddress;

    //define constructor
    public Address(String firstName, String lastName, String streetAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Override
    public String toString() {
        return
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Street Address='" + streetAddress + '\'' + ";";
    }
}
