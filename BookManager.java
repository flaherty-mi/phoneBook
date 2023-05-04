// Programmers: Adam Curtin, Meghan Flaherty
// Course: CS 145 Java
// Date: 4/26/2023
// Assignment: Phone Book
// Purpose: To store and retrieve contact information from user entries

// call node in your manager class. It is it's own class

import java.util.*;

    public class BookManager extends BookMain {
        String firstName = Person.firstNames;
        String lastName = Person.lastNames;
        String address = Person.addresses;
        String city = Person.cities;
        String phoneNumber = Person.phoneNumbers;
        private LinkedList<Person> Contact;
        public BookManager() {
    
          //  Contact = new LinkedList<Person>();
    
        }
    
        public void prompt() {
            String choice;
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
                finally {
                    System.out.println("Finally Resolved");
                }
            } // end while loop
    
        }
    
        public void menu() {
            System.out.println("Welcome to our phone book");
            System.out.println("Please choose from the following options:");
            System.out.println("Add: add a new contact");
            System.out.println("Remove: delete a current contact");
            System.out.println("Search: find a current contact");
            System.out.println("Change: modify a current contact's information");
            System.out.println("Quit: quit this program");
            System.out.println("Enter the title from the options above");
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
            Contact.add(new Person(firstName, lastName, address, city, phoneNumber));
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
//     // add, delete, modify, or search for an entry
//     // beginning middle and end
//     private ListNode front; // first value in the list

//     // post: constructs an empty list
//     public BookManager() {
//         front = null;
//     } // end 

//    // public Scanner input;
//     private int currentDirectoryLength = 0;

//     // public class ListNode {
//     //     String data;
//     //     ListNode next;
//     // } // end ListNode

//     // returns contents of the list
//     public String toString() {
//         if (front == null) {
//             return "[]";
//         } else {
//             String result = "[" + front.data;
//             ListNode current = front.next;
//             while (current != null) {
//                 result += ", " + current.data;
//                 current = current.next;
//             }
//             result += "]";
//             return result;
//         }
//     } // end toString

//     // appends given value to end of list
//     public void add(String value) {
//         if(front == null) {
//             front = new ListNode(value);
//         } else {
//             ListNode current = front;
//             while (current.next != null) {
//                 current = current.next;
//             } //end while
//             current.next = new ListNode(value);
//         } // end else
//     } //end add string value



    




//     public void setFirstName() {

//         // prompt user for first name
//         System.out.println("Enter First Name: ");
//         String newFirstName = input.next();

//         // Capitalize 
//         String capitalize = newFirstName.substring(0,1).toUpperCase();
//         newFirstName = capitalize + newFirstName.substring(1);




//     }








// } // end BookManager Class
