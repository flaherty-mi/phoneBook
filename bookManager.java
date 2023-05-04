// Meghan Flaherty & Adam Curtin

package phoneBook;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class bookManager extends bookMain{
    String firstName = Person.firstNames;
    String lastName = Person.lastNames;
    String address = Person.addresses;
    String city = Person.cities;
    String phoneNumber = Person.phoneNumbers;
    // private LinkedList<Person> Contact;
    public bookManager() {

        menu();
        LinkedList<Person> Contact;
        // Contact = new LinkedList<Person>();
    }

    public void prompt() {
        String choice = null;
        Scanner input = new Scanner(System.in);
        menu();

        while (input.hasNext()) {
            try {
                choice = input.next(choice.toLowerCase());

                switch(choice) {
                    case "add":
                        addContact(input);
                        break;
                    case "remove":
                        deleteContact(input);
                        break;
                    case "search":
                        searchContact(input);
                        break;
                    case "change":
                        modifyContact(input);
                        break;
                    case "quit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Option invalid, please try again");
                        break;
                } // end switch
            } // end try
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        } // end while loop

    }

    public void menu(){
        System.out.println("Welcome to our phone book");
        System.out.println("Please choose from the following options:");
        System.out.println("Add: add a new contact");
        System.out.println("Remove: delete a current contact");
        System.out.println("Search: find a current contact");
        System.out.println("Change: modify a current contact's information");
        System.out.println("Quit: quit this program");
        System.out.println("Enter the title from the options above");
        prompt();
    }

    // method for adding a new contact node
    public void addContact(Scanner input) {
        // must create a new node here for input into LL<Person>
        System.out.println("Please input the following information as prompted");
        System.out.print("First name");
        firstName = input.next();
        // make first == firstName

        System.out.println("Last name");
        String last = input.next();
        // make last == lastName

        System.out.println("Address");
        String addy = input.next();
        // make addy == address

        System.out.println("City");
        String citi = input.next();
        // make citi == city

        System.out.println("Phone number");
        String num = input.next();
        // make num == phoneNumber


        if (num.length() != 12) {
            System.out.println("phone numbers must be 12 digits long. " +
                    "Please try again");
            num = input.next();
        }
        Contact.add( new Person(firstName, lastName, address, city, phoneNumber));
    }

    public StringtoString() {
        return String.format
    }

    // method for deleting a current contact node
    public void deleteContact(Scanner input) {

    }

    // method for finding specific contact node
    public void searchContact(Scanner input) {
        // can search via: name, address, city, phone #
        // specify the search type
        // create methods for each string type
    }

    // method for modifying a current contact node
    public void modifyContact(Scanner input) {

    }



}
