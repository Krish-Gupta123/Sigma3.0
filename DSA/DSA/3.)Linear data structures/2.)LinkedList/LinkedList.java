// preparing linked list fom scratch

public class LinkedList {
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

    public int iterative_Search(int num)// O(n)
    {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == num)// key found
            {
                return index;
            }
            temp = temp.next;
            index++;

        }
        return -1;// key does not exist
    }

    public int recursive_Search(Node head, int num)// O(n)
    {

        if (head == null)// base case
        {
            return -1;// key not found
        }
        if (head.data == num) {
            return 0;
        }
        int prev = recursive_Search(head.next, num);
        if (prev == -1) {
            return -1;
        }
        return prev + 1;
    }

    public void reverse()// O(n)
    {
        Node curr = tail = head;
        Node prev = null;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

        }
        head = prev;
    }

    public int remove_nth_node_from_end(int n)// O(n)
    // (code written by me different from mam's code refer nb if u want to see mam's
    // code)
    {
        int val;

        if (n > size) {
            System.out.println("size of linked list is : " + size);
            return -1;
        }
        if (n == 1) {
            val = removeLast();
            return val;
        } else if (n == size) {
            val = removeFirst();
            return val;
        } else {
            int remove = size - n;
            Node temp = head;
            for (int i = 0; i < remove - 1; i++) {
                temp = temp.next;
            }
            val = temp.next.data;
            temp.next = temp.next.next;
            size--;

            return val;
        }
    }

    public void palindrome()// O(n)
    {
        Node slow = head;
        Node fast = head;

        // find mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow = mid

        // reverse last half
        Node curr = slow;
        Node prev = null;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // comparision
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (right.data != left.data) {
                System.out.println("given linked list is not a palindrome");
                return;
            }
            left = left.next;
            right = right.next;
        }
        System.out.println("given linked list is a palindrome");

    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();

        // l1.head = new Node(1);

        // l1.head.next = new Node(2);
        // note : linked list addfirst aur add last method se he create karni hai yaha
        // pe kyuki humne head aur tail
        // variable ko alag se kahi point nhi kiya hai voh add first aur add last he
        // karenge jab unhe use karenge

        // l1.addFirst(2);// head 2 ,tail 2
        // l1.print();
        // l1.addFirst(1);// head 1 , tail 2
        // l1.print();
        // l1.addLast(3);// head 1,tail 3
        // l1.print();
        // l1.addLast(4);// head 1 ,tail 4
        // l1.print();
        // l1.addMiddle(9, 2);
        // l1.print();
        // System.out.println(l1.size);
        // l1.removeFirst();
        // l1.print();
        // System.out.println(l1.size);
        // l1.removeLast();
        // l1.print();
        // System.out.println(l1.size);
        // System.out.println(l1.iterative_Search(4));
        // System.out.println(l1.iterative_Search(20));
        // System.out.println(l1.recursive_Search(head, 4));
        // System.out.println(l1.recursive_Search(head, 20));
        // l1.reverse();
        // l1.print();
        // l1.remove_nth_node_from_end(5);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();
        l1.palindrome();
    }

}