public class Node {
    
        private PersonContact person;
        private Node next;
    
        public Node(PersonContact person) {
            this.person = person;
            this.next = null;
        }
    
        public PersonContact getPerson() {
            return person;
        }
    
        public void setPerson(PersonContact person) {
            this.person = person;
        }
    
        public Node getNext() {
            return next;
        }
    
        public void setNext(Node next) {
            this.next = next;
        }
    } // end node class
    

