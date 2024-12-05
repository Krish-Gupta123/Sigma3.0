// public class LinkedListPart2 {
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
// public static int size;

// // detect a loop or a cycle in a linked list
// public static boolean detectLoopOrCycleInLinkedlist()
// // popularly known as Floyd's cycle finding algorithm
// {
// Node slow = head;
// Node fast = head;

// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;

// if (slow == fast) {
// return true;// cycle exist
// }
// }

// return false;// cycle does not exist

// }

// // remove a loop or a cycle in a linked list
// public static void removeLoopOrCycleFromLinkedList() {
// Node slow = head;
// Node fast = head;
// boolean cycle = false;

// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;

// if (slow == fast) {
// cycle = true;
// break;
// }
// }

// if (cycle == false) {
// return;
// }

// // // finding last node
// // //code written by me
// // slow = head;
// // while (slow.next != fast.next) {
// // slow = slow.next;
// // fast = fast.next;
// // }

// // fast.next = null;
// // }

// // finding last node
// // code written by mam
// slow = head;
// Node prev = null;// last node
// while (slow != fast) {
// slow = slow.next;
// prev = fast;
// fast = fast.next;
// }

// prev.next = null;
// }

// public static void main(String args[]) {
// head = new Node(2);
// head.next = new Node(4);
// head.next.next = new Node(6);
// head.next.next.next = new Node(8);
// head.next.next.next.next = head.next;
// // 2->4->6->8->4

// // System.out.println(detectLoopOrCycleInLinkedlist());
// removeLoopOrCycleFromLinkedList();
// Node ptr = head;
// while (ptr != null) {
// System.out.println(ptr.data);
// ptr = ptr.next;
// }
// }
// }

// **********************************************************************************************************

// JCF (Linked list using java collection frameworks)

// import java.util.LinkedList;

// public class LinkedListPart2 {
// public static void main(String[] args) {
// LinkedList<Integer> l1 = new LinkedList<>();
// l1.addFirst(3);
// l1.addFirst(2);
// l1.addFirst(1);
// l1.addLast(4);
// l1.addLast(5);
// System.out.println(l1);
// l1.removeFirst();
// l1.removeLast();
// System.out.println(l1);
// }
// }

// ************************************************************************************************************

// Merge sort using linked list and Zigzag linked list (medium level questions)

// public class LinkedListPart2 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;// ismai khud he declare karne pe 0 store ho jaega

//     public void addFirst(int data)// O(1)
//     {
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data)// O(1)
//     {
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print()// O(n)
//     {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "--> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public Node midNode(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next; // +1
//             fast = fast.next.next; // +2
//         }

//         return slow;
//     }

//     public Node merge(Node left, Node right) {
//         Node temp = new Node(-1);
//         Node mergedLL = temp;
//         while (left != null && right != null) {
//             if (left.data <= right.data) {
//                 mergedLL.next = left;
//                 mergedLL = mergedLL.next;
//                 left = left.next;
//             } else {
//                 mergedLL.next = right;
//                 mergedLL = mergedLL.next;
//                 right = right.next;
//             }

//         }
//         if (left != null) {
//             mergedLL.next = left;

//             left = left.next;
//             mergedLL = mergedLL.next;
//         }
//         if (right != null) {
//             mergedLL.next = right;

//             right = right.next;
//             mergedLL = mergedLL.next;
//         }

//         return temp.next;
//     }

//     public Node mergeSort(Node head) {
//         // base case
//         if (head == null || head.next == null) {
//             return head;
//         }
//         // find mid node

//         Node mid = midNode(head);

//         // left and right merge sort

//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newleft = mergeSort(head);
//         Node newright = mergeSort(rightHead);

//         // merge

//         return merge(newleft, newright);

//     }

//     public void zigzag() {
//         // find mid
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         Node mid = slow;

//         // reversing secong half
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;

//         while (left != null && right != null) {
//             nextL = left.next;
//             left.next = right;

//             nextR = right.next;
//             right.next = nextL;
//             left = nextL;
//             right = nextR;
//         }

//     }

//     public static void main(String args[]) {

//         LinkedListPart2 l1 = new LinkedListPart2();
//         l1.addFirst(4);
//         l1.addFirst(2);
//         l1.addLast(1);
//         l1.addFirst(3);
//         // l1.addLast(5);
//         l1.print();
//         // head = l1.mergeSort(head);

//         l1.zigzag();
//         l1.print();

//     }

// }

//***********************************************************************************************************

//doubly linked list and reverse doubly linked list

public class LinkedListPart2

{

    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;

    }

    public void print() {

        Node temp = head;

        System.out.print("null <-- ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("<--> ");
            }
            temp = temp.next;
        }
        System.out.print("--> null");
        System.out.println();
    }

    public void reverse() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public static void main(String args[]) {
        LinkedListPart2 dll = new LinkedListPart2();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        dll.reverse();
        dll.print();

        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);
    }
}