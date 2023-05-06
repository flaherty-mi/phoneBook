public class TransferMethods {
     // method to search for a contact in the linked list
     public void searchContact(Scanner input) {
        System.out.print("Enter the name of the contact to search for: ");
        String name = input.next();

        Person current = head;
        boolean found = false;

        while (current != null) {
            if (current.getPerson().getFullName().equals(name)) {
                System.out.println("Contact found:");
                System.out.println(current.getPerson());
                found = true;
                break;
            }
            current = current.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // method to delete a contact from the linked list
    public void deleteContact(Scanner input) {
        System.out.print("Enter the name of the contact to delete: ");
        String name = input.next();

        Person current = head;
        Person previous = null;
        boolean found = false;

        while (current != null) {
            if (current.getPerson().getFullName().equals(name)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                System.out.println("Contact deleted:");
                System.out.println(current.getPerson());
                found = true;
                break;
            }
            previous = current;
            current = current.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // method to modify a contact in the linked list
    public void modifyContact(Scanner input) {
        System.out.print("Enter the name of the contact to modify: ");
        String name = input.next();

        Person current = head;
        boolean found = false;

        while (current != null) {
            if (current.getPerson().getFullName().equals(name)) {
                System.out.println("Contact found:");
                System.out.println(current.getPerson());

                System.out.println("Enter new information for this contact:");
                System.out.print("First name: ");
                String firstName = input.next();
                System.out.print("Last name: ");
                String lastName = input.next();
                System.out.print("Address: ");
                String address = input.next();
                System.out.print("City: ");
                String city = input.next();
                System.out.print("Phone number: ");
                String phoneNumber = input.next();

                current.getPerson().setFirstName(firstName);
                current.getPerson().setLastName(lastName);
                current.getPerson().setAddress(address);
                current.getPerson().setCity(city);
                current.getPerson().setPhoneNumber(phoneNumber);

                System.out.println("Contact updated:");
                System.out.println(current.getPerson());
                found = true;
                break;
            }
            current = current.getNext();
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // method to display all contacts in the linked list
    public void display() {
        Person current = head;

        while (current != null) {
            System.out.println(current.getPerson());
            current = current.getNext();
        }
    }
}
    

