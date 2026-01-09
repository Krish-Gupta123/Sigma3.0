// // build tree with pre order traversal
// // *************************************************************************
// public class binaryTreesP1 {

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

// static class BinaryTree {
// static int idx = -1;

// public static Node buildTree(int[] Nodes) {
// idx++;

// if (Nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(Nodes[idx]);
// newNode.left = buildTree(Nodes);
// newNode.right = buildTree(Nodes);

// return newNode;

// }
// }

// public static void main(String args[]) {
// int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
// BinaryTree tree = new BinaryTree();
// Node root = tree.buildTree(Nodes);
// System.out.println(root.data);

// }
// }

// // pre order , post order ,inorder traversal and level order traversal;
// //
// ******************************************************************************

// import java.util.*;

// public class binaryTreesP1 {

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

// static class BinaryTrees {
// static int idx = -1;

// public static Node buildTree(int[] nodes) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;

// }

// public static void preorder(Node root) {
// if (root == null) {
// return;
// }

// System.out.print(root.data + " ");
// preorder(root.left);
// preorder(root.right);
// }

// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// public static void postorder(Node root) {
// if (root == null) {
// return;
// }

// postorder(root.left);
// postorder(root.right);
// System.out.print(root.data + " ");

// }

// // code is ok but not advisisble for interviews
// public static void levelOrder1(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();

// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // This is interview advisible code
// public static void levelOrder2(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);

// while (!q.isEmpty()) {
// int size = q.size();

// for (int i = 0; i < size; i++) {
// Node currNode = q.remove();
// System.out.print(currNode.data + " ");

// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }

// System.out.println();
// }
// }
// }

// public static void main(String args[]) {
// int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };

// BinaryTrees tree = new BinaryTrees();
// Node root = tree.buildTree(Nodes);

// System.out.print("preorder travelsal : ");
// tree.preorder(root);
// System.out.println();

// System.out.print("inorder travelsal : ");
// tree.inorder(root);
// System.out.println();

// System.out.print("postorder travelsal : ");
// tree.postorder(root);
// System.out.println();

// // less interview advisible
// System.out.println("level order traversal : ");
// tree.levelOrder1(root);

// // more interview advisisble
// System.out.println("level order traversal : ");
// tree.levelOrder2(root);

// }
// }

// // height of the tree
// //
// ******************************************************************************

// public class binaryTreesP1 {
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

// public static int height(Node root) {
// if (root == null) {
// return 0;
// }

// int lh = height(root.left); // left height
// int rh = height(root.right); // right height

// return Math.max(lh, rh) + 1;
// }

// public static void main(String args[]) {

// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.left = new Node(6);
// root.right.right = new Node(7);

// System.out.println(height(root));
// }
// }

// // count of nodes
// //
// ******************************************************************************

// public class binaryTreesP1 {

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

// public static int count(Node root) {
// if (root == null) {
// return 0;
// }

// int lc = count(root.left); // left count
// int rc = count(root.right); // right count

// return lc + rc + 1;
// }

// public static void main(String args[]) {
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.left = new Node(6);
// root.right.right = new Node(7);

// System.out.println(count(root));
// }
// }

// // sum of nodes
// // *************************************************************************

// public class binaryTreesP1 {

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

// public static int sum(Node root) {
// if (root == null) {
// return 0;
// }

// int ls = sum(root.left); // left sum
// int rs = sum(root.right); // right sum

// return ls + rs + root.data;
// }

// public static void main(String args[]) {
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.left = new Node(6);
// root.right.right = new Node(7);

// System.out.println(sum(root));
// }
// }
