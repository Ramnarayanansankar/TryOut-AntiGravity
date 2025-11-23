public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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
    }

    public void deleteByValue(int data) {
        if (head == null)
            return;

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println(data + " not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
            else
                head = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Deleted " + data);
    }

    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteByValue(20);
        dll.displayForward();

        dll.deleteByValue(5);
        dll.displayForward();
    }
}
