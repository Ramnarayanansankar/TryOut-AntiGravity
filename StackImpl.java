public class StackImpl {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop(); // Underflow test
    }
}
