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

       // Person Contact  = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);


        LinkedList<Person> Contact = new LinkedList<>();

        bookManager.firstNames = "Meghan";
        bookManager.lastNames = "Flaherty";
        bookManager.addresses = "700 Corlis Ave NE";
        bookManager.cities = "Bellingham";
        bookManager.phoneNumbers = "(206) 222-3333";

        Contact.add (new Person(firstNames, lastNames, addresses, cities, phoneNumbers));
        

      //  new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
        new bookManager(Contact);

    }

        }