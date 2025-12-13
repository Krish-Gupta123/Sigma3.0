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
// public class Queues {

// static class Queue {
// static int[] arr;
// static int size;
// static int front;
// static int rear;

// Queue(int n) {
// arr = new int[n];
// size = n;
// front = -1;
// rear = -1;
// }

// public static boolean isEmpty() {
// return front == -1 && rear == -1;
// }

// public static boolean isFull() {
// return (rear + 1) % size == front;
// }

// // add : O(1)
// public static void add(int num) {
// if (isFull()) {
// System.out.println("Queue is full");
// return;
// }

// if (isEmpty()) {
// rear = front = 0;
// arr[rear] = num;
// } else {
// rear = (rear + 1) % size;
// arr[rear] = num;
// }

// }

// // remove : O(1)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// int el = arr[front];

// // for last element
// if (front == rear) {
// front = rear = -1;
// } else {
// front = (front + 1) % size;
// }

// return el;

// }

// // peek:O(1)
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return arr[front];
// }

// }

// public static void main(String[] args) {
// Queue q = new Queue(3);

// q.add(1);
// q.add(2);
// q.add(3);

// System.out.print(q.remove() + " ");
// q.add(4);
// System.out.print(q.remove() + " ");
// q.add(5);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }

// }
// }

// //****************************** queue implementation using linked list

// public class Queues {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }

// }

// static class queue {
// static Node head = null;
// static Node tail = null;

// public static boolean isEmpty() {
// return head == null && tail == null;
// }

// //add
// public static void add(int data) {

// Node newNode = new Node(data);
// if (isEmpty()) {
// head = tail = newNode;
// } else {
// tail.next = newNode;
// tail = tail.next;
// }

// }

// // remove
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// } else if (head == tail) {// if only one element
// int val = head.data;
// head = tail = null;
// return val;

// } else {
// int val = head.data;
// head = head.next;
// return val;
// }

// }

// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return head.data;
// }
// }

// public static void main(String[] args) {
// queue q = new queue();
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

// //****************************** Queue in JCF

// import java.util.*;

// public class Queues {
// public static void main(String[] args) {
// // Queue<Integer> q = new LinkedList<>();
// Queue<Integer> q = new ArrayDeque<>();

// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }
// }
// }

// //****************************** Queue using two stacks

// // code 1 where add : O(n) , remove : O(1) , peek : O(1)
// import java.util.*;

// public class Queues {

// static class queue {
// static Stack<Integer> s1 = new Stack<>();
// static Stack<Integer> s2 = new Stack<>();

// public static boolean isEmpty() {
// return s1.isEmpty();
// }

// // add : O(n)
// public static void add(int data) {
// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }

// s1.push(data);

// while (!s2.isEmpty()) {
// s1.push(s2.pop());
// }
// }

// // remove: O(1)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return s1.pop();
// }

// // peek : O(1)
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return s1.peek();
// }
// }

// public static void main(String[] args) {
// queue q = new queue();
// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }
// }
// }

// //or

// // code 2 where add : O(1) , remove : O(1) , peek : O(n)

// import java.util.*;

// public class Queues {

// static class queue {
// static Stack<Integer> s1 = new Stack<>();
// static Stack<Integer> s2 = new Stack<>();

// public static boolean isEmpty() {
// return s1.isEmpty();
// }

// // add : O(1)
// public static void add(int data) {
// s1.push(data);
// }

// // remove: O(n)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }

// int val = s2.pop();

// while (!s2.isEmpty()) {
// s1.push(s2.pop());
// }

// return val;
// }

// // peek : O(1)
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }

// int val = s2.peek();

// while (!s2.isEmpty()) {
// s1.push(s2.pop());
// }

// return val;
// }
// }

// public static void main(String[] args) {
// queue q = new queue();
// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }
// }
// }

// //****************************** Stack using two queues

// // code 1 where push : O(n) , pop : O(1) , peek : O(1)

// import java.util.*;

// public class Queues {
// static class stack {
// static Queue<Integer> q1 = new LinkedList<>();
// static Queue<Integer> q2 = new LinkedList<>();

// public static boolean isEmpty() {
// return q1.isEmpty();
// }

// public static void push(int data) {

// q2.add(data);

// while (!q1.isEmpty()) {
// q2.add(q1.remove());
// }

// while (!q2.isEmpty()) {
// q1.add(q2.remove());
// }
// }

// public static int pop() {
// if (isEmpty()) {
// System.out.println("stack is empty");
// return -1;
// }

// return q1.remove();
// }

// public static int peek() {
// if (isEmpty()) {
// System.out.println("stack is empty");
// return -1;
// }

// return q1.peek();
// }
// }

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.print(s.peek() + " ");
// s.pop();
// }
// }
// }

// //or
// // code 2 where push : O(1) , pop : O(n) , peek : O(n)

// import java.util.*;

// public class Queues {
// static class stack {
// static Queue<Integer> q1 = new LinkedList<>();
// static Queue<Integer> q2 = new LinkedList<>();

// public static boolean isEmpty() {
// return q1.isEmpty() && q2.isEmpty();
// }

// public static void push(int data) {
// if (!q1.isEmpty()) {
// q1.add(data);
// } else {
// q2.add(data);
// }
// }

// public static int pop() {
// if (isEmpty()) {
// System.out.println("stack is empty");
// return -1;
// }

// int top = -1;

// if (!q1.isEmpty()) {
// while (!q1.isEmpty()) {
// top = q1.remove();
// if (q1.isEmpty()) {
// break;
// }
// q2.add(top);
// }
// } else {
// while (!q2.isEmpty()) {
// top = q2.remove();
// if (q2.isEmpty()) {
// break;
// }
// q1.add(top);
// }
// }

// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// System.out.println("stack is empty");
// return -1;
// }

// int top = -1;

// if (!q1.isEmpty()) {
// while (!q1.isEmpty()) {
// top = q1.remove();
// q2.add(top);
// }
// } else {
// while (!q2.isEmpty()) {
// top = q2.remove();
// q1.add(top);
// }
// }

// return top;
// }
// }

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.print(s.peek() + " ");
// s.pop();
// }
// }
// }

// //***************** First non-repeating character in a stream of characters

// import java.util.*;

// public class Queues {

// public static void printNonReprating(String str) {
// int[] freq = new int[26];
// Queue<Character> q = new LinkedList<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// q.add(ch);
// freq[ch - 'a']++;

// while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
// q.remove();
// }

// if (q.isEmpty()) {
// System.out.print(-1 + " ");
// } else {
// System.out.print(q.peek() + " ");
// }
// }
// }

// public static void main(String[] args) {
// String str = "aabccxb";
// printNonReprating(str);

// }
// }

// //****************************** Interleave 2 halves of a queue(even length)

// import java.util.*;

// public class Queues {

// public static void interLeave(Queue<Integer> q) {
// int size = q.size();

// Queue<Integer> firstHalf = new LinkedList<>();

// for (int i = 0; i < size / 2; i++) {
// firstHalf.add(q.remove());
// }

// while (!firstHalf.isEmpty()) {
// q.add(firstHalf.remove());
// q.add(q.remove());
// }
// }

// public static void main(String[] args) {
// Queue<Integer> q = new LinkedList<>();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// q.add(6);
// q.add(7);
// q.add(8);
// q.add(9);
// q.add(10);

// interLeave(q);

// while (!q.isEmpty()) {
// System.out.print(q.peek() + " ");
// q.remove();
// }
// }
// }

// //****************************** queue reversal

// import java.util.*;

// public class Queues {

// public static void reverse(Queue<Integer> q) {
// Stack<Integer> s = new Stack<>();

// while (!q.isEmpty()) {
// s.push(q.remove());
// }

// while (!s.isEmpty()) {
// q.add(s.pop());
// }
// }

// public static void main(String[] args) {
// Queue<Integer> q = new LinkedList<>();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// reverse(q);

// while (!q.isEmpty()) {
// System.out.print(q.remove() + " ");
// }

// System.out.println();
// }
// }

// //****************************** Deque implementation

// import java.util.*;

// public class Queues {
// public static void main(String[] args) {
// Deque<Integer> deque = new LinkedList<>();

// deque.addFirst(1);
// deque.addFirst(2);
// deque.addLast(3);
// deque.addLast(4);

// System.out.println(deque);

// deque.removeFirst();
// deque.removeLast();
// System.out.println(deque);

// System.out.println("first element: " + deque.getFirst());
// System.out.println("last element: " + deque.getLast());
// }
// }

// //****************************** Stack creation using Deque

// import java.util.*;

// public class Queues {

// static class Stack {
// Deque<Integer> deque = new LinkedList<>();

// public void push(int data) {
// deque.addLast(data);
// }

// public int pop() {
// return deque.removeLast();
// }

// public int peek() {
// return deque.getLast();
// }

// }

// public static void main(String[] args) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// // Note : ismai is Empty function use mat karna kyuki woh banaya nhi hai
// deque
// // se

// System.out.println("peek = " + s.peek());
// System.out.println(s.pop());
// System.out.println(s.pop());
// System.out.println(s.pop());

// }
// }

// //****************************** Queue creation using Deque

// import java.util.*;

// public class Queues {

// static class queue {
// Deque<Integer> deque = new LinkedList<>();

// public void add(int data) {
// deque.addLast(data);
// }

// public int remove() {
// return deque.removeFirst();
// }

// public int peek() {
// return deque.getFirst();
// }

// }

// public static void main(String[] args) {
// queue q = new queue();
// q.add(1);
// q.add(2);
// q.add(3);

// // Note : ismai is Empty function use mat karna kyuki woh banaya nhi hai
// deque se

// System.out.println("peek = " + q.peek());
// System.out.println(q.remove());
// System.out.println(q.remove());
// System.out.println(q.remove());

// }
// }
