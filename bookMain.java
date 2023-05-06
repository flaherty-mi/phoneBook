// Meghan Flaherty & Adam Curtin

package phoneBook;
import java.util.LinkedList;
import java.util.*;


public class bookMain {

    public static String firstNames = null;
    public static String lastNames = null;
    public static String addresses = null;
    public static String cities = null;
    public static String phoneNumbers = null;


    public static void main(String[] args) {

      //  phoneForBook phoneBook = new phoneForBook();
        Person blankNode = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
        blankNode = null;
        LinkedList<Person> Contact = new LinkedList<>();

        bookManager.firstNames = "Adam";
        bookManager.lastNames = "Curtin";
        bookManager.addresses = "700 col Ave NE";
        bookManager.cities = "Bellingham";
        bookManager.phoneNumbers = "678 8992";

        Contact.add(new Person(firstNames, lastNames, addresses, cities, phoneNumbers));


        new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
        new bookManager(Contact);

    }

        }