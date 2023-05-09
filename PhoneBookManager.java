// Programmers: Adam Curtin, Meghan Flaherty
// Course: CS 145 Java
// Date: 4/26/2023
// Assignment: Phone Book
// Purpose: To store and retrieve contact information from user entries

// call node in your manager class. It is it's own class

import java.util.Scanner;

public class PhoneBookManager {
    private Node head;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("[Add] - Add a contact");
            System.out.println("[Delete] - Delete a contact");
            System.out.println("[Modify] - Modify a contact");
            System.out.println("[Search] - Search for a contact");
            System.out.println("[View] - View all contacts");
            System.out.println("[Quit] - Exit");
    
            String choice = scanner.next();
    
            switch (choice.toLowerCase()) {
                case "add":
                case "a":
                    addContact();
                    break;
                case "delete":
                case "d":
                    deleteContact();
                    break;
                case "modify":
                case "m":
                    modifyContact();
                    break;
                case "search":
                case "s":
                    searchContact();
                    break;
                case "view":
                case "v":
                    viewContacts();
                    break;
                case "quit":
                case "q":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    } // end menu
    
    

    // Method to add a new contact to the phone book
    public void addContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter city: ");
        String city = input.nextLine();
        System.out.print("Enter phone number: ");
        String phone = input.nextLine();
    
        PersonContact person = new PersonContact(firstName, lastName, address, city, phone);
        Node newNode = new Node(person);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        System.out.println("Contact added successfully.");
    } // end add contact

    // Method to search for a contact by name and display it
    public void searchContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
    
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.getPerson().getFirstNames().equalsIgnoreCase(firstName) && current.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
                System.out.println(current.getPerson().toString());
                found = true;
                break;
            }
            current = current.getNext();
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    } // end search contact

    // Method to delete a contact by name
    // Get both first and last names to avoid deleting multiple contacts
    public void deleteContact() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter last name: ");
            String lastName = input.nextLine();
    
            // Check if empty. If yes, print empty
            if (head == null) {
                System.out.println("The phone book is empty.");
                return;
            } // end if empty
              // If the input names match the names in the node, 
              // move the reference to next node, which deletes that contact
            if (head.getPerson().getFirstNames().equalsIgnoreCase(firstName)
                && head.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
                head = head.getNext();
                System.out.println("Contact deleted successfully.");
                return;
            } // end if names match
            // move node
            Node previous = head;
            Node current = head.getNext();
            // While node isn't null, if name doesn't match move to next node
        while (current != null) {
            if (current.getPerson().getFirstNames().equalsIgnoreCase(firstName)
                && current.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
                previous.setNext(current.getNext());
                return;
            } // end if name doesn't match
            previous = current;
            current = current.getNext();
        } // end whlie node isn't null
        // If it goes through without finding input name, print not found
        System.out.println("Contact not found.");
    } // end deleteContact

    
    // Method to modify a contact
    // Get both first and last name to ensure proper contact
public void modifyContact() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first name of the contact to modify: ");
    String firstName = input.nextLine();
    System.out.print("Enter last name of the contact to modify: ");
    String lastName = input.nextLine();

    // Prompt user to put in modified contact information
    System.out.print("Enter new first name: ");
    String newFirstName = input.nextLine();
    System.out.print("Enter new last name: ");
    String newLastName = input.nextLine();
    System.out.print("Enter new address: ");
    String newAddress = input.nextLine();
    System.out.print("Enter new city: ");
    String newCity = input.nextLine();
    System.out.print("Enter new phone number: ");
    String newPhone = input.nextLine();

    PersonContact newPerson = new PersonContact(newFirstName, newLastName, newAddress, newCity, newPhone);
    Node current = head;
    boolean found = false;
    while (current != null) {
        if (current.getPerson().getFirstNames().equalsIgnoreCase(firstName) && current.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
            current.setPerson(newPerson);
            found = true;
            break;
        }
        current = current.getNext();
    }
    if (!found) {
        System.out.println("Contact not found.");
    } else {
        System.out.println("Contact modified successfully.");
    }
} // end modify

    // Method to view the entire phone book
    public void viewContacts() {
        // Check if empty. If yes, print empty.
        if (head == null) {
            System.out.println("The phone book is empty.");
            return;
        } // end if empty
        Node current = head;
        // while current node doesn't reference null, print contents.
        while (current != null) {
            System.out.println(current.getPerson().toString());
            current = current.getNext();
        } // end while loop
    } // end view contacts
} // end bookManager class
