public class QueueImpl {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued " + data);
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued " + data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Underflow test
    }
}
