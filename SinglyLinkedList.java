public class SinglyLinkedList {

    // Static inner class for Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to delete a node by value
    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete " + data);
            return;
        }

        // If head holds the key to be deleted
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted " + data);
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the key to be deleted
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If key was not present in linked list
        if (current == null) {
            System.out.println(data + " not found in the list.");
            return;
        }

        // Unlink the node from linked list
        prev.next = current.next;
        System.out.println("Deleted " + data);
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Inserting 10, 20, 30 at the end...");
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        System.out.println("\nInserting 5 at the beginning...");
        list.insertAtBeginning(5);
        list.display();

        System.out.println("\nDeleting 20...");
        list.deleteByValue(20);
        list.display();

        System.out.println("\nDeleting 100 (not in list)...");
        list.deleteByValue(100);
        list.display();

        System.out.println("\nDeleting 5 (head)...");
        list.deleteByValue(5);
        list.display();
    }
}
