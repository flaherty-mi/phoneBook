/*
 Meghan Flaherty & Adam Curtin
 constructor class
*/

package phoneBook;

import java.util.LinkedList;
public class Person extends bookMain {
    // put as public static to call variables in bookManager
    // see if theres another way to do this
    // (static method with variables could pass to other methods)
    // should variables be kept private for this assignemnt - is it neccesary?

    public static Person next;


    LinkedList<Person> people = new LinkedList<>();



    public Person(String firstNames, String lastNames, String addresses,
                  String cities, String phoneNumbers){
        next = null;
        setFirstName(firstNames);
        setLastName(lastNames);
        setAddress(addresses);
        setCity(cities);
        setPhoneNumber(phoneNumbers);
        getFirstName();
        getLastName();
        getAddress();
        getCity();
        getPhoneNumber();
    }



    public static String getFirstName() {
        return firstNames;
    }

    public void setFirstName(String firstNames) {
        this.firstNames = firstNames;
    }

    public static String getLastName() {

        return lastNames;
    }

    public void setLastName(String lastNames) {

        this.lastNames = lastNames;
    }

    public static String getAddress() {

        return addresses;
    }

    public void setAddress(String addresses) {

        this.addresses = addresses;
    }

    public static String getCity() {

        return cities;
    }

    public void setCity(String cities) {

        this.cities = cities;
    }

    public static String getPhoneNumber() {

        return phoneNumbers;
    }

    public void setPhoneNumber(String phoneNumbers) {

        this.phoneNumbers = phoneNumbers;
    }

    public static Person getNext() {
        return next;
    }

    public static void setNext(Person next) {
        Person.next = next;
    }

    public String toString() {
        return String.format("First name: " + firstNames + "Last name: " + lastNames + "Address: " + addresses +
                "City: " + cities + "Phone number: (360) " + phoneNumbers);
    }


  //  public static ContactNode.Node getPerson() {
       // ContactNode.Node Person;
       // return Person;
    // }
}


