// // Stack using ArrayList
// //
// ****************************************************************************************************

// import java.util.ArrayList;

// public class stacksPart1 {

// public static class Stack {
// static ArrayList<Integer> list = new ArrayList<>();

// public static boolean isEmpty() {
// return list.size() == 0;
// }

// public static void push(int data) {
// list.add(data);
// }

// public static int pop() {
// if (isEmpty()) {
// return -1;
// }
// int top = list.get(list.size() - 1);
// list.remove(list.size() - 1);
// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// return -1;

// }
// return list.get(list.size() - 1);
// }
// }

// public static void main(String[] args) {
// Stack s = new Stack();

// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// // Stack using LinkedList
// //
// ****************************************************************************************************

// public class stacksPart1 {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class Stack {
// public static Node head = null;

// public static boolean isEmpty() {
// return head == null;
// }

// // push
// public static void push(int data) {
// Node newNode = new Node(data);
// if (isEmpty()) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// // pop
// public static int pop() {
// if (head == null) {
// return -1;
// }

// int top = head.data;
// head = head.next;
// return top;
// }

// // peek
// public static int peek() {
// if (isEmpty()) {
// return -1;
// }
// return head.data;
// }
// }

// public static void main(String[] args) {
// Stack s = new Stack();

// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// // Stack using collections framework
// //
// ****************************************************************************************************

// import java.util.*;

// public class stacksPart1 {
// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();

// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// // Push at Bottom of Stack
// //
// ****************************************************************************************************
// import java.util.*;

// public class stacksPart1 {

// public static void pushAtBottom(int data, Stack<Integer> s) {

// if (s.isEmpty()) {
// s.push(data);
// return;
// }

// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();

// s.push(1);
// s.push(2);
// s.push(3);

// pushAtBottom(4, s);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }

// }
// }

// // Reverse a String using Stack
// //
// ****************************************************************************************************

// import java.util.*;

// public class stacksPart1 {

// public static String reverseString(String str) {

// Stack<Character> s = new Stack<>();
// int idx = 0;

// while (idx < str.length()) {
// s.push(str.charAt(idx));
// idx++;
// }

// StringBuilder result = new StringBuilder();
// while (!s.isEmpty()) {
// char curr = s.pop();
// result.append(curr);
// }

// return result.toString();
// }

// public static void main(String[] args) {

// String str = "abc";
// String result = reverseString(str);
// System.out.println(result);
// }
// }

// // Reverse a Stack
// //
// ****************************************************************************************************

// import java.util.*;

// public class stacksPart1 {

// public static void reverseStack(Stack<Integer> s) {
// if (s.isEmpty()) {
// return;
// }

// int top = s.pop();
// reverseStack(s);
// pushAtBottom(top, s);
// }

// public static void pushAtBottom(int data, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }

// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }

// public static void printStack(Stack<Integer> s) {
// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();

// s.push(1);
// s.push(2);
// s.push(3);
// // 3 2 1

// reverseStack(s);
// // 1 2 3
// printStack(s);

// }
// }

// // Stock Span Problem
// //
// ****************************************************************************************************
// import java.util.*;

// public class stacksPart1 {

// public static void stockSpan(int[] stocks, int[] span) {
// Stack<Integer> s = new Stack<>();

// span[0] = 1;
// s.push(0);

// for (int i = 1; i < stocks.length; i++) {
// int currPrice = stocks[i];

// while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
// s.pop();
// }

// if (s.isEmpty()) {
// span[i] = i + 1;
// } else {
// span[i] = i - s.peek();
// }

// s.push(i);
// }
// }

// public static void main(String[] args) {
// int[] stocks = { 100, 80, 60, 70, 60, 85, 100 };
// int[] span = new int[stocks.length];

// stockSpan(stocks, span);

// for (int i = 0; i < span.length; i++) {
// System.out.println(span[i] + " ");
// }
// }
// }

// // Next Greater Element
// //
// ****************************************************************************************************
// import java.util.*;

// public class stacksPart1 {
// public static void main(String[] args) {
// int[] arr = { 6, 8, 0, 1, 3 };
// int[] nextGreater = new int[arr.length];
// Stack<Integer> s = new Stack<>();

// for (int i = arr.length - 1; i >= 0; i--) {
// while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
// s.pop();
// }

// if (s.isEmpty()) {
// nextGreater[i] = -1;
// } else {
// nextGreater[i] = arr[s.peek()];
// }
// s.push(i);
// }

// for (int i = 0; i < nextGreater.length; i++) {
// System.out.print(nextGreater[i] + " ");
// }
// }
// }
