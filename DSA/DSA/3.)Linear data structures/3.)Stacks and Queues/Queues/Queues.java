// // ****************************** queue implementation using array
// public class Queues {

// static class Queue {

// static int[] arr;
// static int size;
// static int rear;

// Queue(int n) {
// arr = new int[n];
// size = n;
// rear = -1;
// }

// public static boolean isEmpty() {
// return rear == -1;
// }

// // add : O(1)
// public static void add(int num) {
// if (rear == size - 1) {
// System.out.println("Queue is full");
// return;
// }

// rear++;
// arr[rear] = num;
// }

// //remove : O(n)
// public static int remove() {
// if (isEmpty()) {
// System.out.println(":Queue is empty");
// return -1;
// }

// int el = arr[0];

// for (int i = 0; i < rear; i++) {
// arr[i] = arr[i + 1];
// }

// rear--;
// return el;
// }

// // peek:O(1)
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return arr[0];
// }

// }

// public static void main(String[] args) {
// Queue q = new Queue(5);

// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }

// }
// }

// // *****************************circular queue implementation using array
public class Queues {

    static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add : O(1)
        public static void add(int num) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (isEmpty()) {
                rear = front = 0;
                arr[rear] = num;
            } else {
                rear = (rear + 1) % size;
                arr[rear] = num;
            }

        }

        // remove : O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int el = arr[front];

            // for last element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return el;

        }

        // peek:O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.print(q.remove() + " ");
        q.add(4);
        System.out.print(q.remove() + " ");
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
