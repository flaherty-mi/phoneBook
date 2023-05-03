// Programmers: Adam Curtin, Meghan Flaherty
// CS 145 Java
// 5.03.2023
// Assignment: Phone Book
// Purpose Set up the Node class for use by BookManager and Main.

public class ContactNode {
    
    //Represent a node of the singly linked list    
    class Node{    
        String data;    
        Node next;    
            
        public Node(String data) {    
            this.data = data;    
            this.next = null;    
        }  // end   
    } // end Node class 

     //Represent the head and tail of the singly linked list    
     public Node head = null;    
     public Node tail = null;    
         
     //addNode() will add a new node to the list    
     public void addNode(String data) {    
         //Create a new node    
         Node newNode = new Node(data);    
             
         //Checks if the list is empty    
         if(head == null) {    
             //If list is empty, both head and tail will point to new node    
             head = newNode;    
             tail = newNode;    
         }    
         else {    
             //newNode will be added after tail such that tail's next will point to newNode    
             tail.next = newNode;    
             //newNode will become new tail of the list    
             tail = newNode;    
         }    
     } // end addNode
         
     //countNodes() will count the nodes present in the list    
     public int countNodes() {    
         int count = 0;    
         //Node current will point to head    
         Node current = head;    
             
         while(current != null) {    
             //Increment the count by 1 for each node    
             count++;    
             current = current.next;    
         } // end while current isn't null 
         return count;    
     } // end countNodes

    // Make it able to print contents
    //  public String toString() {
    //     return 
    //  }

     //display() will display all the nodes present in the list    
     public void display() {    
         //Node current will point to head    
         Node current = head;    
         if(head == null) {    
             System.out.println("List is empty");    
             return;    
         } // end if head is null
         System.out.println("Nodes of singly linked list: ");    
         while(current != null) {    
             //Prints each node by incrementing pointer    
             System.out.print(current.data + " ");    
             current = current.next;    
         } // end while current isn't null
         System.out.println();    
     } // end display 
} // end ContactNode class
