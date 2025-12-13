// Note : assignment question 2,3 mai priority queue use hoga toh usse heaps
// chapter ke baad karna hai abhi nhi jamega

// //****************************** practice question 1

// import java.util.*;

// public class practiceSet {

//     public static void printBinary(int n) {
//         Queue<String> q = new LinkedList<>();
//         q.add("1");

//         while (n-- > 0) {
//             String s1 = q.remove();

//             System.out.println(s1);

//             q.add(s1 + "0");
//             q.add(s1 + "1");
//         }

//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printBinary(n);

//     }
// }

// //****************************** practice question 4

// import java.util.*;

// public class practiceSet {

//     public static void reverseQueueFirstKElements(Queue<Integer> q, int k) {
//         Stack<Integer> s = new Stack<>();

//         if (q.isEmpty() == true || k > q.size()) {
//             return;
//         }
//         if (k <= 0) {
//             return;
//         }

//         // push first k elements into stack
//         for (int i = 0; i < k; i++) {
//             s.push(q.remove());
//         }

//         // enqueu the stack elements back to queue
//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }

//         // remove the remaining elements and enqueue them back
//         for (int i = 0; i < q.size() - k; i++) {
//             q.add(q.remove());
//         }

//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         int k = 5;

//         reverseQueueFirstKElements(q, k);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//     }
// }

// // ***************************or 

// import java.util.*;

// public class practiceSet {

//     public static void helper(Queue<Integer> q, int k) {
//         // base case
//         if (k == 0) {
//             return;
//         }

//         int temp = q.remove();
//         helper(q, k - 1);
//         q.add(temp);
//     }

//     public static void reverseQueueFirstKElements(Queue<Integer> q, int k) {

//         if (q.isEmpty() == true || k > q.size()) {
//             return;
//         }
//         if (k <= 0) {
//             return;
//         }

//         helper(q, k);

//         // remove the remaining elements and enqueue them back
//         for (int i = 0; i < q.size() - k; i++) {
//             q.add(q.remove());
//         }

//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         int k = 5;

//         reverseQueueFirstKElements(q, k);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//     }
// }

// //****************************** practice question 5

// // brute force approach
// public class practiceSet {

//     public static void printMax(int[] arr, int n, int k) {
//         for (int i = 0; i < n - k + 1; i++) {
//             int max = arr[i];
//             for (int j = i; j < i + k; j++) {
//                 if (arr[j] > max) {
//                     max = arr[j];
//                 }
//             }
//             System.out.print(max + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
//         int k = 3;
//         printMax(arr, arr.length, k);
//     }
// }

// // optimised approach

import java.util.*;

public class practiceSet {

    public static void printMax(int[] arr, int n, int k) {

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < k; i++) {

            // remove all the smaller elements from back
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }

            // add current element at back of deque
            dq.addLast(i);
        }

        // print first window max
        System.out.print(arr[dq.peek()] + " ");

        // process rest of the elements
        // i.e., from arr[k] to arr[n-1]

        for (int i = k; i < n; i++) {

            // reomove elements which are out of this window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }

            // remove all the smaller elements from back
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }

            // add current element at back of deque
            dq.addLast(i);

            // print the maximum element of current window
            System.out.print(arr[dq.peek()] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}