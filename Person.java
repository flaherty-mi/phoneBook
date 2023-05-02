// Meghan Flaherty & Adam Curtin

// focuses on implimentaing a single linked list
// opportunity to use package keyword
package phoneBook;
import java.util.LinkedList;

public class Person extends bookMain{

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;


    // LinkedList<Person> people = new LinkedList<Person>();

    public Person(String firstName, String lastName, String address,
                        String city, String phoneNumber){

        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setPhoneNumber(phoneNumber);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    }


