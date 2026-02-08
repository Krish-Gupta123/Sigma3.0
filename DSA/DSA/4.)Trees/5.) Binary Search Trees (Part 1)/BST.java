// // Build a BST
// // **************************************************************************************

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int[] values = { 5, 1, 3, 4, 2, 7 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//     }
// }

// //Search in a BST
// //
// **************************************************************************************

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static boolean search(Node root, int val) {
//         if (root == null) {
//             return false;
//         }

//         if (root.data == val) {
//             return true;
//         }

//         if (root.data > val) {
//             return search(root.left, val);
//         } else {
//             return search(root.right, val);
//         }

//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int[] values = { 5, 1, 3, 4, 2, 7 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();

//         if (search(root, 2)) {
//             System.out.println("found");
//         } else {
//             System.out.println("not found");
//         }

//     }
// }

// //Delete a node
// //
// **************************************************************************************

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static Node delete(Node root, int val) {
//         if (root.data > val) {
//             root.left = delete(root.left, val);
//         } else if (root.data < val) {
//             root.right = delete(root.right, val);
//         } else { // equal condition ..... the node to be deleted

//             // case1 : leaf node
//             if (root.left == null && root.right == null) {
//                 return null;
//             }

//             // case2 : single child
//             else if (root.left == null) {
//                 return root.right;
//             } else if (root.right == null) {
//                 return root.left;
//             }

//             // case 3 - both children
//             else {
//                 Node IS = findInorderSuccessor(root.right);
//                 root.data = IS.data;
//                 root.right = delete(root.right, IS.data);
//             }
//         }

//         return root;
//     }

//     public static Node findInorderSuccessor(Node root) {
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int[] values = { 5, 1, 3, 4, 2, 7 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();

//         root = delete(root, 1);
//         Inorder(root);

//     }
// }

// //Print in range
// //
// **************************************************************************************

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void range(Node root, int k1, int k2) {
//         if (root == null) {
//             return;
//         }

//         if (root.data >= k1 && root.data <= k2) {
//             range(root.left, k1, k2);
//             System.out.print(root.data + " ");
//             range(root.right, k1, k2);
//         }

//         else if (root.data > k2) {
//             range(root.left, k1, k2);
//         }

//         else {
//             range(root.right, k1, k2);
//         }
//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int[] values = { 8, 5, 11, 14, 3, 6 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();

//         System.out.println("print in range of 5 to 12");
//         range(root, 5, 12);
//     }
// }

// //Root to leaf path
// //
// **************************************************************************************

// import java.util.*;

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
//         if (root == null) {
//             return;
//         }

//         path.add(root.data);

//         if (root.left == null && root.right == null) {
//             printPath(path);
//         }

//         printRoot2Leaf(root.left, path);
//         printRoot2Leaf(root.right, path);

//         path.remove(path.size() - 1);
//     }

//     public static void printPath(ArrayList<Integer> path) {
//         for (int i = 0; i < path.size(); i++) {
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.print("null");
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();

//         printRoot2Leaf(root, new ArrayList<>());

//     }
// }

// //Validate BST
// //
// **************************************************************************************

// import java.util.*;

// public class BST {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             Node newNode = new Node(val);
//             return newNode;
//         }

//         if (root.data > val) {
//             // left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // right subtree
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void Inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }

//     public static boolean isValidBST(Node root, Node min, Node max) {
//         if (root == null) {
//             return true;
//         }

//         if (min != null && root.data <= min.data) {
//             return false;
//         }

//         if (max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
//     }

//     public static void main(String[] args) {
//         int[] values = { 8, 5, 3, 6, 10, 11, 14 };
//         Node root = null;

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();

//         if (isValidBST(root, null, null)) {
//             System.out.println("valid");
//         } else {
//             System.out.println("not valid");
//         }

//     }
// }

// //Mirror a BST
// //
// **************************************************************************************

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = createMirror(root);
        preOrder(root);
    }
}