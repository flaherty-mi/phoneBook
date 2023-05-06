// Meghan Flaherty & Adam Curtin

package phoneBook;
import java.util.*;
//import java.util.List;
//import java.util.Arrays;
//import java.util.Scanner;

public class bookManager extends bookMain {
    static String firstName = Person.firstNames;
    static String lastName = Person.lastNames;
    static String address = Person.addresses;
    static String city = Person.cities;
    static String phoneNumber = Person.phoneNumbers;
    private Person head;
    Person current = head;

    // LinkedList<Person> Contact = new LinkedList<>();
    public bookManager(LinkedList<Person> Contact) {

        menu(Contact);

    }

    public void prompt(LinkedList<Person> Contact) {
        String choice = null;
        Scanner input = new Scanner(System.in);
        menu(Contact);

        while (input.hasNext()) {
            try {
                choice = input.next(choice.toLowerCase());

                switch (choice) {
                    case "add":
                        addContact(input, Contact);
                        break;
                    case "remove":
                        deleteContact(input, Contact, head);
                        break;
                    case "search":
                        searchContact(input, Contact, head);
                        break;
                    case "change":
                        modifyContact(input, Contact, head);
                        break;
                    case "display":
                        displayBook(Contact);
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

    public void menu(LinkedList<Person> Contact) {
        System.out.println("Welcome to our phone book");
        System.out.println("Please choose from the following options:");
        System.out.println("Add: add a new contact");
        System.out.println("Remove: delete a current contact");
        System.out.println("Search: find a current contact");
        System.out.println("Change: modify a current contact's information");
        System.out.println("Display: display phone book");
        System.out.println("Quit: quit this program");
        System.out.println("Enter the title from the options above");
        prompt(Contact);
    }

    // method for adding a new contact node
    public static void addContact(Scanner input, LinkedList<Person> Contact) {

        System.out.println("Please input the following information as prompted");
        System.out.print("First name");
        firstName = input.next();
        
        System.out.println("Last name");
        lastName = input.next();

        System.out.println("Address");
        address = input.next();

        System.out.println("City");
        city = input.next();

        System.out.println("Phone number: (360)");
        phoneNumber = input.next();
        

        if (num.length() != 7) {
            System.out.println("phone numbers must be 7 digits long." +
                    "and does not include area code: (360) ");
            System.out.println("Please try again: (360) ");
            num = input.next();
        }
        // adding new 'Person' node to the contact
        Contact.add(new Person(firstName, lastName, address, city, phoneNumber));
    }

    public String toString() {

        return String.format("First name: " + firstNames + "Last name: " + lastNames + "Address: " + addresses +
                "City: " + cities + "Phone number: (360) " + phoneNumber.substring(0, 2) + "-"
                + phoneNumber.substring(3, 6));
    }

    // method for deleting a current contact node
    public void deleteContact(Scanner input, LinkedList<Person> Contact, Person head) {
        System.out.print("Enter the last name of the contact to delete: ");
        String name = input.next();

        Person current = head;
        Person previous = null;
        boolean found = false;

        while (current != null) {
            if (Person.getLastName().equals(name)) {
                if (previous == null) {
                    Person.getNext();
                    head = Person.next;
                   // head = current.getNext();
                } else {
                    Person.setNext(Person.getNext());
                    previous = Person.next;
                }
                System.out.println("Contact deleted:");
                // System.out.println(current.Person);
                found = true;
                break;
            }
            previous = current;
            current = Person.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }


    }

    // method for finding specific contact node
    public void searchContact(Scanner input, LinkedList<Person> Contact, Person head) {
        System.out.print("Enter the last name of the contact to search for: ");
        String name = input.next();

        Person current = head;
        boolean found = false;

        while (current != null) {
            if (Person.getLastName().equals(name)) {
                System.out.println("Contact found:");
                // System.out.println(current.getPerson());
                found = true;
                break;
            }
            current = Person.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // method for modifying a current contact node
    public void modifyContact(Scanner input, LinkedList<Person> Contact, Person head) {
        System.out.print("Enter the last name of the contact to modify: ");
        String name = input.next();

        Person current = head;
        boolean found = false;

        while (current != null) {
            if (Person.getLastName().equals(name)) {
                System.out.println("Contact found:");
                // System.out.println(current.getPerson());

                System.out.println("Enter new information for this contact:");
                System.out.print("First name: ");
                firstName = input.next();
                
                System.out.print("Last name: ");
                lastName = input.next();
                System.out.print("Address: ");
                address = input.next();
                System.out.print("City: ");
                city = input.next();
                System.out.print("Phone number: ");
                phoneNumber = input.next();

                // current.getPerson();
               // Person current = head;

                Person.getFirstName();
                Person.getLastName();
                Person.getAddress();
                Person.getCity();
                Person.getPhoneNumber();
               // possible fallback -> current.getPerson().setPhoneNumber(phoneNumber);

                System.out.println("Contact updated:");
                // System.out.println(current.getPerson());
                found = true;
                break;
            }
            current = Person.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // method for printing entire phone book in ordered fashion
    public void displayBook(LinkedList<Person> Contact) {

        // loop to print all nodes & fix string orientation
        for (int i = 0; i < Contact.size(); i++) {
            toString();
            System.out.println(Contact.get(i));
        }
    } // end displayBook method
}
