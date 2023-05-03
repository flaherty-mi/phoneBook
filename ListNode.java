

public class ListNode {

    private String firstName;
    private String lastName;
    private String city;
	private String address;
	private String phoneNumber;
	private ListNode next;
	
	// create instance of ListNode and set next to 'null'
	public ListNode() {
		//data = -1;
		next = null;
	}

	//create setters and getters for first firstfirstName, last firstName, address, phone number, city and ListNode
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

    public String getLastName() {
		return lastName;
	}

	public void setLastName(String LastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "firstName = " + firstName + ", lastName = " + lastName + ", Address = " + address + ", Phone Number = "
				+ phoneNumber + ", city = " + city;
	}
} // end node


