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
            System.out.println("add (a). Add a contact");
            System.out.println("delete (d). Delete a contact");
            System.out.println("modify (m). Modify a contact");
            System.out.println("search (s). Search for a contact");
            System.out.println("display (v). View all contacts");
            System.out.println("quit (q). Exit");
    
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
                case "display":
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
    
        Person person = new Person(firstName, lastName, address, city, phone);
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
    public void deleteContact() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter last name: ");
            String lastName = input.nextLine();
    
            if (head == null) {
                System.out.println("The phone book is empty.");
                return;
            }
            if (head.getPerson().getFirstNames().equalsIgnoreCase(firstName) && head.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
                head = head.getNext();
                System.out.println("Contact deleted successfully.");
                return;
            }
            Node previous = head;
            Node current = head.getNext();
        while (current != null) {
            if (current.getPerson().getFirstNames().equalsIgnoreCase(firstName) && current.getPerson().getLastNames().equalsIgnoreCase(lastName)) {
                previous.setNext(current.getNext());
                return;
            }
            previous = current;
            current = current.getNext();
        }
        System.out.println("Contact not found.");
    } // end deleteContact

    
    // Method to modify a contact
public void modifyContact() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first name of the contact to modify: ");
    String firstName = input.nextLine();
    System.out.print("Enter last name of the contact to modify: ");
    String lastName = input.nextLine();

    System.out.print("Enter new first name: ");
    String newFirstName = input.nextLine();
    System.out.print("Enter new last name: ");
    String newLastName = input.nextLine();
    System.out.print("Enter new address: ");
    String newAddress = input.nextLine();
    System.out.print("Enter new city: ");
    String newCity = input.nextLine();
    System.out.print("Enter new phone number (only digits): ");
    String newPhone = input.nextLine();

    Person newPerson = new Person(newFirstName, newLastName, newAddress, newCity, newPhone);
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
        if (head == null) {
            System.out.println("The phone book is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.getPerson().toString());
            current = current.getNext();
        }
    }
} // end bookManager class
