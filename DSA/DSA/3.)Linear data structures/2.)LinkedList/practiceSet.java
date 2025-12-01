// // question 1
// **********************************************************************************

// import java.util.*;

// public class practiceSet {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;// ismai khud he declare karne pe 0 store ho jaega

// public void addFirst(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// tail.next = newNode;
// tail = newNode;
// }

// public void print()// O(n)
// {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "--> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public int removeFirst() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// int val = head.data;
// head = head.next;
// size--;
// return val;

// }

// public int removeLast() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// Node prev = head;
// // while (prev.next.next != null) {
// // prev = prev.next;
// // }
// for (int i = 1; i < size - 1; i++) {// for loop kaha tak run karna hai aache
// se samjhna
// prev = prev.next;
// }
// int val = prev.next.data;// tail.data
// prev.next = null;
// size--;
// tail = prev;
// return val;
// }

// // question 1 brute force approach

// public static Node getIntersection(Node head1, Node head2) {

// if (head1 == null || head2 == null) {
// return null;
// }

// while (head2 != null) {
// Node temp = head1;

// while (temp != null) {
// if (head2 == temp) {
// return temp;
// }
// temp = temp.next;
// }
// head2 = head2.next;
// }
// return null;
// }

// // question 1 optimized approach of manjyot

// public static Node getIntersection2(Node head1, Node head2) {
// if (head1 == null || head2 == null) {
// return null;
// }

// Node temp1 = head1;
// Node temp2 = head2;

// // agar insmai intersection point he nhi hoga toh automatically null return
// ho
// // jaega kyuki agar loop mai dono same node pe point karenge toh loop end ho
// // jaega aur agar koi intersection point nahi hoga toh dono ek he time pe
// null
// // ko point karenge after travelling both list by each temp1 and temp2
// while (temp1 != temp2) {
// temp1 = (temp1 == null) ? head2 : temp1.next;
// temp2 = (temp2 == null) ? head1 : temp2.next;
// }
// return temp1;
// }

// // question 1 optimized approach of practice session

// public static Node getIntersection3(Node head1, Node head2) {
// int len1 = 0;
// int len2 = 0;

// Node temp1 = head1;

// while (temp1 != null) {
// temp1 = temp1.next;
// len1++;
// }

// Node temp2 = head2;

// while (temp2 != null) {
// temp2 = temp2.next;
// len2++;
// }

// int diff = Math.abs(len1 - len2);

// if (diff > 0) {
// if (len1 > len2) {
// for (int i = 1; i <= diff; i++) {
// head1 = head1.next;
// }
// } else if (len2 > len1) {
// for (int i = 1; i <= diff; i++) {
// head2 = head2.next;
// }
// }

// }

// while (head1 != null && head2 != null && head1 != head2) {
// head1 = head1.next;
// head2 = head2.next;
// }

// return head1;

// }

// public static void main(String args[]) {
// practiceSet l1 = new practiceSet();

// Node head1 = new Node(1);
// Node head2 = new Node(5);

// head1.next = new Node(3);

// Node intersection = new Node(7);
// head1.next.next = intersection;
// head1.next.next.next = new Node(8);
// head1.next.next.next.next = new Node(10);

// head2.next = intersection;

// System.out.println((getIntersection(head1, head2)).data);
// System.out.println((getIntersection2(head1, head2)).data);
// System.out.println((getIntersection3(head1, head2)).data);

// // get intersection 2 aur 3 dono ka time complexity O(m+n) he hai toh dono
// mai
// // se koi bhi use kar sakte nut most optimised and interview friendly
// approach
// // is getintersection 2

// }
// }

// // question 2
// //
// **********************************************************************************

// import java.util.*;

// public class practiceSet {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;// ismai khud he declare karne pe 0 store ho jaega

// public void addFirst(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// tail.next = newNode;
// tail = newNode;
// }

// public void print()// O(n)
// {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "--> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public int removeFirst() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// int val = head.data;
// head = head.next;
// size--;
// return val;

// }

// public int removeLast() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// Node prev = head;
// // while (prev.next.next != null) {
// // prev = prev.next;
// // }
// for (int i = 1; i < size - 1; i++) {// for loop kaha tak run karna hai aache
// se samjhna
// prev = prev.next;
// }
// int val = prev.next.data;// tail.data
// prev.next = null;
// size--;
// tail = prev;
// return val;
// }

// // time complexity : O(N)
// // dhyann se dekho toh outer loop aur inner loop dono curr node ko he aage
// bada
// // rha hai isliye O(N) time complexity
// //apna college sol sheet ans

// public static void deleteNode(int m, int n, Node head) {
// Node curr = head;
// Node temp;

// int count;

// while (curr != null) {
// for (count = 1; count < m && curr != null; count++) {
// curr = curr.next;
// }

// if (curr == null) {
// return;
// }

// temp = curr.next;

// for (count = 1; count <= n && temp != null; count++) {
// temp = temp.next;
// }

// curr.next = temp;
// curr = temp;
// }

// }

// // time complexity: O(N)
// // practice session sol
// public static void deleteNode2(int m, int n, Node head) {
// Node curr = head;
// Node prev = null;
// Node temp = null;
// int countM = m;
// int countN = n;
// boolean flag = true;

// while (curr != null && n > 0) {

// if (countM == 0) {
// flag = false;
// temp = prev;
// countM = m;
// }

// if (countN == 0) {
// flag = true;
// temp.next = curr;
// countN = n;
// }

// if (flag) {
// countM--;
// } else {
// countN--;
// }

// prev = curr;
// curr = curr.next;
// }

// if (countN != n) {
// temp.next = null;
// }
// }

// public static void main(String args[]) {
// practiceSet l1 = new practiceSet();

// l1.addLast(1);
// l1.addLast(2);
// l1.addLast(3);
// l1.addLast(4);
// l1.addLast(5);
// l1.addLast(6);
// l1.addLast(7);
// l1.addLast(8);
// l1.addLast(9);
// l1.addLast(10);

// l1.print();

// // deleteNode(2, 2, head);
// deleteNode2(2, 2, head);
// l1.print();
// }
// }

// // question 3
// //**********************************************************************************

// import java.util.*;

// public class practiceSet {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;// ismai khud he declare karne pe 0 store ho jaega

// public void addFirst(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// tail.next = newNode;
// tail = newNode;
// }

// public void print()// O(n)
// {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "--> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public int removeFirst() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// int val = head.data;
// head = head.next;
// size--;
// return val;

// }

// public int removeLast() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// Node prev = head;
// // while (prev.next.next != null) {
// // prev = prev.next;
// // }
// for (int i = 1; i < size - 1; i++) {// for loop kaha tak run karna hai aache
// se samjhna
// prev = prev.next;
// }
// int val = prev.next.data;// tail.data
// prev.next = null;
// size--;
// tail = prev;
// return val;
// }

// public static void swapNode(int x, int y) {
// if (x == y) {
// return;
// }

// Node currX = head;
// Node prevX = null;

// while (currX != null && currX.data != x) {
// prevX = currX;
// currX = currX.next;

// }

// Node currY = head;
// Node prevY = null;

// while (currY != null && currY.data != y) {
// prevY = currY;
// currY = currY.next;
// }

// if (currX == null || currY == null) {
// return;
// }

// if (prevX != null) {
// prevX.next = currY;
// } else {
// head = currY;
// }

// if (prevY != null) {
// prevY.next = currX;
// } else {
// head = currX;
// }

// Node temp = currX.next;
// currX.next = currY.next;
// currY.next = temp;

// }

// public static void main(String args[]) {
// practiceSet l1 = new practiceSet();

// l1.addLast(1);
// l1.addLast(2);
// l1.addLast(3);
// l1.addLast(4);
// l1.addLast(5);
// l1.addLast(6);
// l1.addLast(7);
// l1.addLast(8);
// l1.addLast(9);
// l1.addLast(10);

// l1.print();

// swapNode(3, 7);

// l1.print();
// }
// }

// // question 4
// //
// **********************************************************************************

// import java.util.*;

// public class practiceSet {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;// ismai khud he declare karne pe 0 store ho jaega

// public void addFirst(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(int data)// O(1)
// {
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode;
// return;
// }

// tail.next = newNode;
// tail = newNode;
// }

// public void print()// O(n)
// {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "--> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public int removeFirst() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// int val = head.data;
// head = head.next;
// size--;
// return val;

// }

// public int removeLast() {
// if (size == 0) {
// System.out.println("Linked list is empty");
// return Integer.MIN_VALUE;
// } else if (size == 1) {
// int val = head.data;
// head = tail = null;
// size = 0;
// return val;
// }
// Node prev = head;
// // while (prev.next.next != null) {
// // prev = prev.next;
// // }
// for (int i = 1; i < size - 1; i++) {// for loop kaha tak run karna hai aache
// se samjhna
// prev = prev.next;
// }
// int val = prev.next.data;// tail.data
// prev.next = null;
// size--;
// tail = prev;
// return val;
// }

// // my approach
// public static Node oddeven() {

// Node t1 = head;
// Node evenHead = new Node(-1); // dummy node for even values
// Node oddHead = new Node(-1); // dummy node for odd values
// Node evenTail = evenHead; // pointer to construct even list
// Node oddTail = oddHead; // pointer to construct odd values

// if (head == null || head.next == null)
// return head; // Handle edge cases

// while (t1 != null) {
// if (t1.data % 2 == 0) {
// evenTail.next = t1;
// evenTail = evenTail.next;
// } else {
// oddTail.next = t1;
// oddTail = oddTail.next;
// }
// t1 = t1.next;
// }

// evenTail.next = oddHead.next;
// oddTail.next = null;

// return evenHead.next;

// }

// // apna college sol
// public static Node oddeven2() {

// Node end = head;
// Node curr = head;
// Node prev = null;

// while (end.next != null) {
// end = end.next;
// }

// Node newEnd = end;

// while (curr != end && curr.data % 2 != 0) {
// newEnd.next = curr;
// curr = curr.next;
// newEnd.next.next = null;
// newEnd = newEnd.next;
// }

// if (curr.data % 2 == 0) {
// head = curr;

// while (curr != end) {
// if (curr.data % 2 == 0) {
// prev = curr;
// curr = curr.next;
// } else {
// prev.next = curr.next;
// newEnd.next = curr;
// curr.next = null;
// newEnd = curr;
// curr = prev.next;
// }
// }

// } else {
// prev = curr;
// }

// if (end.data % 2 != 0 && end != newEnd) {
// prev.next = end.next;
// end.next = null;
// newEnd.next = end;
// }

// return head;

// }

// public static void main(String args[]) {
// practiceSet l1 = new practiceSet();
// l1.addLast(2);
// l1.addLast(4);
// l1.addLast(6);
// l1.addLast(1);
// l1.addLast(4);
// l1.addLast(3);
// l1.addLast(5);
// l1.addLast(7);
// l1.addLast(1);
// l1.print();
// // head = oddeven();
// head = oddeven2();

// l1.print();
// }
// }

// // question 5
// //*****************************************************************************

// import java.util.*;

// public class practiceSet {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;// ismai khud he declare karne pe 0 store ho jaega

// public static void print()// O(n)
// {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "--> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public static Node merge(Node a, Node b) {
// Node result = null;
// if (a == null) {
// return b;
// }

// if (b == null) {
// return a;
// }

// if (a.data <= b.data) {
// result = a;
// result.next = merge(a.next, b);
// } else {
// result = b;
// result.next = merge(a, b.next);
// }

// return result;
// }

// public static Node mergeKList(Node arr[], int last) {

// while (last != 0) {
// int i = 0;
// int j = last;

// while (i < j) {
// arr[i] = merge(arr[i], arr[j]);
// i++;
// j--;

// if (i >= j) {
// last = j;
// }
// }
// }

// return arr[0];
// }

// public static void main(String args[]) {
// int k = 3;
// int n = 4; // n kahi use nhi hua sol mai likha tha toh likh diya
// Node[] arr = new Node[k];

// arr[0] = new Node(1);
// arr[0].next = new Node(3);
// arr[0].next.next = new Node(5);
// arr[0].next.next.next = new Node(7);

// arr[1] = new Node(2);
// arr[1].next = new Node(4);
// arr[1].next.next = new Node(6);
// arr[1].next.next.next = new Node(8);

// arr[2] = new Node(0);
// arr[2].next = new Node(9);
// arr[2].next.next = new Node(10);
// arr[2].next.next.next = new Node(11);

// head = mergeKList(arr, k - 1);

// print();

// }
// }