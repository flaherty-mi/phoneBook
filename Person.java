/*
 Meghan Flaherty & Adam Curtin
 constructor class
*/

package phoneBook;

import java.util.LinkedList;
public class Person extends bookMain {

    public static Person next;
   // public static Person previous; 
   // Person next;

    LinkedList<Person> people = new LinkedList<>();

    public Person(String firstNames, String lastNames, String addresses,
                  String cities, String phoneNumbers){
     
        Person.next = null;

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

    public Person head = null;
    public Person tail = null;
/* 
    public void add(String firstNames, String lastNames, String addresses,
    String cities, String phoneNumbers) {

        Person newPerson = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);

    }
*/
    public static String getFirstName() {
        return firstNames;
    }

    public void setFirstName(String firstNames) {
        bookMain.firstNames = firstNames;
    }

    public static String getLastName() {

        return lastNames;
    }

    public void setLastName(String lastNames) {

        bookMain.lastNames = lastNames;
    }

    public static String getAddress() {

        return addresses;
    }

    public void setAddress(String addresses) {

        bookMain.addresses = addresses;
    }

    public static String getCity() {

        return cities;
    }

    public void setCity(String cities) {

        bookMain.cities = cities;
    }

    public static String getPhoneNumber() {

        return phoneNumbers;
    }

    public void setPhoneNumber(String phoneNumbers) {

        bookMain.phoneNumbers = phoneNumbers;
    }

    public static Person getNext() {
        return next;
    }

    public static void setNext(Person next) {
        Person.next = next;
    }

    public String toString() {
        return String.format("First name: " + firstNames + "  Last name: " + lastNames + "  Address: " + addresses +
                "  City: " + cities + "  Phone number: " + phoneNumbers);
    }

   


}


