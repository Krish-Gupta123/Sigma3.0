// // Check if a binary tree is univalued or not
// // ************************************************************

// public class practiceSet {

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

// public static boolean isUnivalued(Node root) {
// if (root == null) {
// return true;
// }

// if (root.left != null && root.data != root.left.data) {
// return false;
// }

// if (root.right != null && root.data != root.right.data) {
// return false;
// }

// return isUnivalued(root.left) && isUnivalued(root.right);
// }

// public static void main(String[] args) {
// Node root = new Node(1);
// root.left = new Node(1);
// root.right = new Node(1);
// root.left.left = new Node(1);
// root.left.right = new Node(1);

// System.out.println(isUnivalued(root));
// }
// }

// // Invert Binary Tree
// // ************************************************************

// public class practiceSet {

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

// public static void InvertTree(Node root) {
// if (root == null) {
// return;
// }

// // swap
// Node temp = root.left;
// root.left = root.right;
// root.right = temp;

// InvertTree(root.left);
// InvertTree(root.right);

// }

// public static void preOrder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preOrder(root.left);
// preOrder(root.right);
// }

// public static void main(String[] args) {
// Node root = new Node(4);
// root.left = new Node(2);
// root.right = new Node(7);
// root.left.left = new Node(1);
// root.left.right = new Node(3);
// root.right.left = new Node(6);
// root.right.right = new Node(9);

// preOrder(root);
// InvertTree(root);
// System.out.println();
// preOrder(root);

// }
// }

// // Delete leaf nodes with values as x
// // ************************************************************

// public class practiceSet {

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

// public static Node deleteLeafNodes(Node root, int target) {
// if (root == null) {
// return null;
// }

// root.left = deleteLeafNodes(root.left, target);
// root.right = deleteLeafNodes(root.right, target);

// if (root.left == null && root.right == null && root.data == target) {
// return null;
// }

// return root;
// }

// public static void preOrder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preOrder(root.left);
// preOrder(root.right);
// }

// public static void main(String[] args) {
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(2);
// root.right.left = new Node(2);
// root.right.right = new Node(4);

// preOrder(root);
// deleteLeafNodes(root, 2);
// System.out.println();
// preOrder(root);

// }
// }

// // Find All duplicates Subtrees
// // ************************************************************

// Practice question 4 nhi samja toh chod diya

// // Maximum Path Sum in a Binary Tree
// // ************************************************************

// public class practiceSet {

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

// static int maxSum = Integer.MIN_VALUE;

// public static int maxPathSum(Node root) {
// if (root == null) {
// return 0;
// }

// int left = Math.max(maxPathSum(root.left), 0);
// int right = Math.max(maxPathSum(root.right), 0);

// maxSum = Math.max(maxSum, left + right + root.data);

// return root.data + Math.max(left, right);
// }

// public static void main(String[] args) {
// Node root = new Node(-10);
// root.left = new Node(9);
// root.right = new Node(20);
// root.right.left = new Node(15);
// root.right.right = new Node(7);

// maxPathSum(root);
// System.out.println(maxSum);

// }
// }