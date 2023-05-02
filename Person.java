/*
 Meghan Flaherty & Adam Curtin
 constructor class
*/

package phoneBook;
import java.util.LinkedList;
public class Person extends bookMain{
    // put as public static to call variables in bookManager
    // see if theres another way to do this
    // (static method with variables could pass to other methods)
    // should variables be kept private for this assignemnt - is it neccesary?
    public static String firstNames;
    public static String lastNames;
    public static String addresses;
    public static String cities;
    public static String phoneNumbers;


    LinkedList<Person> people = new LinkedList<>();

    public Person(String firstNames, String lastNames, String addresses,
                  String cities, String phoneNumbers){

        setFirstName(firstNames);
        setLastName(lastNames);
        setAddress(addresses);
        setCity(cities);
        setPhoneNumber(phoneNumbers);
    }


    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstName(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastName(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddress(String addresses) {
        this.addresses = addresses;
    }

    public String getCities() {
        return cities;
    }

    public void setCity(String cities) {
        this.cities = cities;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumber(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String toString() {
        return String.format(firstNames + ", " + lastNames + ", " + addresses +
                ", " + cities + ", " + phoneNumbers);
    }


}


