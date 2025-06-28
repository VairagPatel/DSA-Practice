public class Queue_LL {

    static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // checking if the queue is empty or not
        public static boolean isEmpty() {
            return tail == null && head == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);

            // if the list is empty
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            // if empty
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            // if single element in our queue
            if (tail == head) {
                head = tail = null;
                return val;
            }
            head = head.next;
            return val;
        }

        // peek
        public static int peek() {
            // if queue empty
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    // Main method in the outer class
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!Queue.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
