public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted " + data + " at the beginning.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted " + data + " at the end.");
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from beginning.");
            return;
        }
        System.out.println("Deleted " + head.data + " from the beginning.");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty. Cannot delete from end.");
            return;
        }
        System.out.println("Deleted " + tail.data + " from the end.");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Forward (Head -> Tail): ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Backward (Tail -> Head): ");
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}