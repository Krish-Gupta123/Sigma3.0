import java.util.*;

public class practiceSet {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;// ismai khud he declare karne pe 0 store ho jaega

    public void addFirst(int data)// O(1)
    {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)// O(1)
    {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print()// O(n)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int data, int index)// O(n)
    {// note: ismai last index pass mat karna linked list ka kyuki tail variable set
     // nhi hoga uss node pe phir aur uske baad
     // agar add last karenge toh program last node ke pehle wale node ko he tail
     // samjega kyuki tail pointer udhar he hai apna
     // thoda aache se dry run karke samjhna yeh sab concepts imp hai

        if (index == 0 || head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int count = 0;
        while (count < index - 1) {// aache se dry run karke samjhna imp hai
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;

        temp.next = newNode;
        return;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        // while (prev.next.next != null) {
        // prev = prev.next;
        // }
        for (int i = 1; i < size - 1; i++) {// for loop kaha tak run karna hai aache se samjhna
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }

    // single pointer mat use karo kuch error aa rha bohot samjh ne ke kosish ki par
    // samja nhi
    // public Node oddeven() {
    // Node t1 = head;
    // Node t2 = new Node(-1);
    // Node temp = t2;

    // if (head == null || head.next == null)
    // return head; // Handle edge cases

    // while (t1 != null) {
    // if (t1.data % 2 == 0) {
    // t2.next = t1;
    // t2 = t2.next;
    // }
    // t1 = t1.next;
    // }

    // t1 = head;
    // while (t1 != null) {
    // if (t1.data % 2 != 0) {
    // t2.next = t1;
    // t2 = t2.next;
    // }
    // t1 = t1.next;
    // }

    // return temp.next;
    // }

    public Node oddeven() {

        Node t1 = head;
        Node evenHead = new Node(-1); // dummy node for even values
        Node oddHead = new Node(-1); // dummy node for odd values
        Node evenTail = evenHead; // pointer to construct even list
        Node oddTail = oddHead; // pointer to construct odd values

        if (head == null || head.next == null)
            return head; // Handle edge cases

        while (t1 != null) {
            if (t1.data % 2 == 0) {
                evenTail.next = t1;
                evenTail = evenTail.next;
            } else {
                oddTail.next = t1;
                oddTail = oddTail.next;
            }
            t1 = t1.next;
        }

        evenTail.next = oddHead.next;
        oddTail.next = null;

        return evenHead.next;

    }

    public static void main(String args[]) {
        practiceSet l1 = new practiceSet();
        l1.addLast(2);
        l1.addLast(4);
        l1.addLast(6);
        l1.addLast(1);
        l1.addLast(4);
        l1.addLast(3);
        l1.addLast(5);
        l1.addLast(7);
        l1.addLast(1);
        l1.print();
        head = l1.oddeven();
        l1.print();
    }
}