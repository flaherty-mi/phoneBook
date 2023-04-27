// Meghan Flaherty & Adam Curtin

// focuses on implimentaing a single linked list
// opportunity to use package keyword

package phoneBook;

public class phoneForBook {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;


    // constructor method for phone book and initial contents
    public phoneForBook(String firstName, String lastName, String address,
                        String city, String phoneNumber) {
        setFirstName(String firstName);
        setLastName(String lastName);
        setAddress(String address);
        setCity(String city);
        setPhoneNumber(String phoneNumber);

    }

    // static method for setting first names
    public static void setFirstName(String firstName) {
        firstName = firstName;
    }

    // static method for setting last names
    public static void setLastName(String lastName) {
        lastName = lastName;
    }

    // static method for setting addresses
    public static void setAddress(String address) {
        address = address;
    }

    // static method for setting city values
    public static void setCity(String city) {
        city = city;
    }

    // static method for setting phone numbers
    public static void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

}
