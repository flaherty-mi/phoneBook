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
    
    public Person head = null;
    public Person tail = null;

    // LinkedList<Person> Contact = new LinkedList<>();
    public bookManager(LinkedList<Person> Contact) {
        menu(Contact);
    }

    // second prompt -> program will not end after one action
    public void rePrompt(LinkedList<Person> Contact) {
        System.out.println();
        System.out.println("Would you like to do something else");
        System.out.println("please type the name of your choice from below");
        System.out.println("Add: add a new contact");
        System.out.println("Remove: delete a current contact");
        System.out.println("Search: find a current contact");
        System.out.println("Change: modify a current contact's information");
        System.out.println("Display: display phone book");
        System.out.println("Quit: quit this program");

       prompt(Contact);
    }

    // goes to what method depending on user input choice
    public void prompt(LinkedList<Person> Contact) {
        
        String choice; 
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            try {
                choice = input.next();
                choice = choice.toLowerCase();
                // switch case for 
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

    // displaying menu
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

    // method for adding a new contact node                                            not yet working - override occurances 
    public void addContact(Scanner input, LinkedList<Person> Contact) {

        System.out.println();
        System.out.println("Please input the following information as prompted");
        System.out.println();
        System.out.print("First name: ");
        firstName = input.next();
        System.out.println();
        
        System.out.print("Last name: ");
        lastName = input.next();
        System.out.println();

        System.out.print("Address: ");
        input.nextLine();
        address = input.nextLine();
        System.out.println();

        System.out.print("City: ");
        city = input.next();
        System.out.println();

        System.out.print("Phone number: ");
        phoneNumber = input.next();
        System.out.println();

        if (head == null) {
            head = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
            tail = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
        }
        else {
            Person.next = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
            tail = new Person(firstNames, lastNames, addresses, cities, phoneNumbers);
        }
        
        // adding new 'Person' node to the contact
        Contact.add (new Person(firstName, lastName, address, city, phoneNumber)); 
        System.out.println("Contact succesfully added");
        rePrompt(Contact); 
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
                System.out.println("First name: " + firstNames + "  Last name: " + lastNames + "  Address: " + addresses +
                "  City: " + cities + "  Phone number: " + phoneNumbers);
                found = true;
                break;
            }
            current = Person.getNext();
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
        rePrompt(Contact);
    }

     // method for deleting a current contact node                                           working now
     public void deleteContact(Scanner input, LinkedList<Person> Contact, Person head) {
        System.out.print("Enter the last name of the contact to delete: ");
        String name = input.next();

        Person current = head;
        this.tail = null;
        boolean found = false;

        while (current != null) {
            if (Person.getLastName().equals(name)) {
                if (tail == null) {
                    Person.getNext();
                    this.head = Person.next;
                } else {
                    Person.setNext(Person.getNext());
                    tail = Person.next;
                }
                System.out.println("Contact deleted");
                found = true;
                break;
            }
            tail = Person.getNext();
        }
        if (!found) {
            System.out.println("Contact not found.");
            name = input.next();
        }
        rePrompt(Contact);
    }

    // method for modifying a current contact node                                                               working now
    public void modifyContact(Scanner input, LinkedList<Person> Contact, Person head) {
        System.out.print("Enter the last name of the contact you wish to modify: ");
        String name = input.next();

        Person current = head;
        boolean found = false;

        while (current != null) {
            // compare input to contact names
            if (Person.getLastName().equals(name)) {
                System.out.println();
                System.out.println("Contact found:");
                System.out.println("First name: " + firstNames + "  Last name: " + lastNames + "  Address: " + addresses +
                "  City: " + cities + "  Phone number: " + phoneNumbers);
                System.out.println();

                System.out.println("Enter new information for this contact:");
                System.out.print("First name: ");
                firstNames = input.next();
                
                System.out.print("Last name: ");
                lastNames = input.next();

                System.out.print("Address: ");
                input.nextLine();
                addresses = input.nextLine();

                System.out.print("City: ");
                cities = input.next();
                
                System.out.print("Phone number: ");
                input.nextLine();
                phoneNumbers = input.nextLine();
                    // replacing variables with new inputs
                    firstNames = Person.getFirstName();
                    lastNames = Person.getLastName();
                    addresses = Person.getAddress();
                    cities = Person.getCity();
                    phoneNumbers = Person.getPhoneNumber();

                System.out.println();
                System.out.println("Contact updated:");
                System.out.println("First name: " + firstNames + "  Last name: " + lastNames + "  Address: " + addresses +
                "  City: " + cities + "  Phone number: " + phoneNumbers);
                found = true;
                break;
            } // end if
            tail = Person.getNext();
        } // end while
        if (!found) {
            System.out.println("Contact not found.");
        } 
        rePrompt(Contact);
    } // end of modify contact

    // method for printing entire phone book in ordered fashion                   
    public void displayBook(LinkedList<Person> Contact) {
        if (Contact != null) {

        // loop to print all nodes & fix string orientation
        for (int i = 0; i < Contact.size(); i++) {
            toString();
            System.out.println(Contact.get(i));
        } 
    } // end if
        else if (Contact == null) {
            System.out.println("The current phone book has no inventory");
            System.out.println("select add from the menu to add a contact");
        } // end else if
        rePrompt(Contact);
    } // end displayBook method
}
