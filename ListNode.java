// Programmers: Adam Curtin, Meghan Flaherty

// Purpose: Class for storing a single node of a linked list.
// This node is for string values.

public class ListNode {

    private String data;   // Data type
    private ListNode next; // Link to next node in the list
	
	// create a Node and set next to 'null'
	public ListNode() {
		this(null);
	} // end empty node construction


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    // create node with given data and null link
    public ListNode(String data) {
        this(data, null);
    } // end String node null construction
	
    // Constructs a node with given data and given link
    public ListNode(String data, ListNode next) {
        this.data = data;
        this.next = next;
    } // end node construction
	
} // end node


