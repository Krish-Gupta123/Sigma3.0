// // convert a sorted array to a balanced binary search tree
// // ****************************************************************

// public class BST2 { //O(N)

// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// public static void preorder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preorder(root.left);
// preorder(root.right);
// }

// public static Node createBST(int[] arr, int st, int end) {
// if (st > end) {
// return null;
// }

// int mid = st + (end - st) / 2;
// Node root = new Node(arr[mid]);
// root.left = createBST(arr, st, mid - 1);
// root.right = createBST(arr, mid + 1, end);

// return root;
// }

// public static void main(String args[]) {
// int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
// Node root = createBST(arr, 0, arr.length - 1);
// preorder(root);
// }

// }

// //convert bst to balance bst
// // ****************************************************************

// import java.util.*;

// public class BST2 {

// static class Node {
// int data;
// Node left;
// Node right;

// public Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// public static void preorder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preorder(root.left);
// preorder(root.right);
// }

// public static void inorder(Node root, ArrayList<Integer> list) {
// if (root == null) {
// return;
// }

// inorder(root.left, list);
// list.add(root.data);
// inorder(root.right, list);
// }

// public static Node createBST(ArrayList<Integer> list, int st, int end) {
// if (st > end) {
// return null;
// }

// int mid = st + (end - st) / 2;
// Node root = new Node(list.get(mid));
// root.left = createBST(list, st, mid - 1);
// root.right = createBST(list, mid + 1, end);

// return root;
// }

// public static Node balanceBST(Node root) { // O(N)
// // inorder traversal - O(N)
// ArrayList<Integer> list = new ArrayList<>();
// inorder(root, list);

// // create balanced BST - O(N)
// return createBST(list, 0, list.size() - 1);

// }

// public static void main(String args[]) {
// Node root = new Node(8);
// root.left = new Node(6);
// root.left.left = new Node(5);
// root.left.left.left = new Node(3);
// root.right = new Node(10);
// root.right.right = new Node(11);
// root.right.right.right = new Node(12);

// root = balanceBST(root);
// preorder(root);
// }

// }

// // Size of largest BST in a Binary Tree
// // ****************************************************************

// public class BST2 {

// static class Node {
// int data;
// Node left;
// Node right;

// public Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class Info {
// boolean isBST;
// int size;
// int min;
// int max;

// public Info(boolean isBST, int size, int min, int max) {
// this.isBST = isBST;
// this.size = size;
// this.min = min;
// this.max = max;
// }
// }

// public static int maxSize = 0;

// public static Info largestBST(Node root) {
// if (root == null) {
// return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
// }

// Info leftInfo = largestBST(root.left);
// Info rightInfo = largestBST(root.right);

// int size = leftInfo.size + rightInfo.size + 1;
// int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
// int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

// if (leftInfo.max >= root.data || rightInfo.min <= root.data) {
// return new Info(false, size, min, max);
// }

// if (leftInfo.isBST && rightInfo.isBST) {
// maxSize = Math.max(maxSize, size);
// return new Info(true, size, min, max);
// }

// return new Info(false, size, min, max);
// }

// public static void main(String args[]) {
// Node root = new Node(50);
// root.left = new Node(30);
// root.left.left = new Node(5);
// root.left.right = new Node(20);
// root.right = new Node(60);
// root.right.left = new Node(45);
// root.right.right = new Node(70);
// root.right.right.left = new Node(65);
// root.right.right.right = new Node(80);

// Info info = largestBST(root);
// System.out.println("largest BST size = " + maxSize);
// }
// }

// // merge two BSTs .... O(N+ M)
// // ****************************************************************

// import java.util.*;

// public class BST2 {

// static class Node {
// int data;
// Node left;
// Node right;

// public Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// public static void inorder(Node root, ArrayList<Integer> list) {
// if (root == null) {
// return;
// }

// inorder(root.left, list);
// list.add(root.data);
// inorder(root.right, list);
// }

// public static void merge(ArrayList<Integer> list1, ArrayList<Integer> list2,
// ArrayList<Integer> mergedList) {
// int i = 0; // for list1
// int j = 0; // for list2

// while (i < list1.size() && j < list2.size()) {
// if (list1.get(i) <= list2.get(j)) {
// mergedList.add(list1.get(i));
// i++;
// } else {
// mergedList.add(list2.get(j));
// j++;
// }
// }

// while (i < list1.size()) {
// mergedList.add(list1.get(i));
// i++;
// }

// while (j < list2.size()) {
// mergedList.add(list2.get(j));
// j++;
// }
// }

// public static Node createBST(ArrayList<Integer> list, int st, int end) {
// if (st > end) {
// return null;
// }

// int mid = st + (end - st) / 2;
// Node root = new Node(list.get(mid));
// root.left = createBST(list, st, mid - 1);
// root.right = createBST(list, mid + 1, end);

// return root;
// }

// public static Node mergeBST(Node root1, Node root2) { // O(N+M)
// // step 1 - inorder traversal of both BSTs
// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();

// inorder(root1, list1);
// inorder(root2, list2);

// // step 2 - merge both sorted lists
// ArrayList<Integer> mergedList = new ArrayList<>();
// merge(list1, list2, mergedList);

// // step 3 - create balanced BST from merged list
// return createBST(mergedList, 0, mergedList.size() - 1);
// }

// public static void preorder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preorder(root.left);
// preorder(root.right);
// }

// public static void main(String args[]) {
// Node root1 = new Node(2);
// root1.left = new Node(1);
// root1.right = new Node(4);

// Node root2 = new Node(9);
// root2.left = new Node(3);
// root2.right = new Node(12);

// Node root = mergeBST(root1, root2);
// preorder(root);
// }

// }