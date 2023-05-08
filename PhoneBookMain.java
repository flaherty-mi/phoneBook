// Programmers: Adam Curtin, Meghan Flaherty
// Course: CS 145 Java
// Date: 4/26/2023
// Assignment: Phone Book
// Purpose: 

// public class PhoneBookMain {
//     public static void main(String[] args) {
//         Person person = new Person("Adam", "Curtin", "123 Main St", "Bellingham", "555-555-5555");
//         Node node = new Node(person);
//         System.out.println(node.getPerson().toString());

//         PhoneBookManager phoneBookManager = new PhoneBookManager();
//         phoneBookManager.addContact();
//         phoneBookManager.viewContacts();
//     } // end main method
// } // end PhoneBookMain


public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();
        phoneBookManager.menu();
    }
}
