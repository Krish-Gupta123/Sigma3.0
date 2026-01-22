// // Kth level of binary tree
// // ***************************************************************

// import java.util.*;

// public class binaryTrees {

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

//     public static void KlevelByRecursion(Node root, int level, int k) {
//         if (root == null) {
//             return;
//         }

//         if (level == k) {
//             System.out.print(root.data + " ");
//             return;
//         }

//         KlevelByRecursion(root.left, level + 1, k);
//         KlevelByRecursion(root.right, level + 1, k);
//     }

//     public static void KlevelByIterative(Node root, int level, int k) {
//         if (root == null) {
//             return;
//         }

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         while (!q.isEmpty()) {
//             int size = q.size();
//             for (int i = 0; i < size; i++) {
//                 Node curr = q.remove();
//                 if (level == k) {
//                     System.out.print(curr.data + " ");
//                 }

//                 if (curr.left != null) {
//                     q.add(curr.left);
//                 }

//                 if (curr.right != null) {
//                     q.add(curr.right);
//                 }
//             }

//             if (level == k) {
//                 break;
//             }
//             level++;

//         }

//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int k = 2;
//         KlevelByRecursion(root, 1, k);
//         System.out.println();
//         KlevelByIterative(root, 1, k);
//     }
// }

// // Lowest Common Ancestor in a Binary Tree...... Brute force approach
// // ***************************************************************

// import java.util.*;

// public class binaryTrees {
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

//     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//         if (root == null) {
//             return false;
//         }

//         path.add(root);

//         if (root.data == n) {
//             return true;
//         }

//         boolean foundLeft = getPath(root.left, n, path);
//         boolean foundRight = getPath(root.right, n, path);

//         if (foundLeft || foundRight) {
//             return true;
//         }

//         path.remove(path.size() - 1);
//         return false;
//     }

//     public static Node lca(Node root, int n1, int n2) { //O(n)
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getPath(root, n1, path1);
//         getPath(root, n2, path2);

//         // last common ancestor
//         int i = 0;
//         for (; i < path1.size() && i < path2.size(); i++) {
//             if (path1.get(i) != path2.get(i)) {
//                 break;
//             }
//         }

//         return path1.get(i - 1);
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4;
//         int n2 = 5;

//         Node lca = lca(root, n1, n2);
//         System.out.println("LCA: " + lca.data);
//     }
// }

// // Lowest Common Ancestor in a Binary Tree...... Optimal approach
// // ***************************************************************

// import java.util.*;

// public class binaryTrees {
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

//     public static Node lca(Node root, int n1, int n2) { // O(n)
//         if (root == null || root.data == n1 || root.data == n2) {
//             return root;
//         }

//         Node leftLca = lca(root.left, n1, n2);
//         Node rightLca = lca(root.right, n1, n2);

//         if (leftLca == null) {
//             return rightLca;
//         }

//         if (rightLca == null) {
//             return leftLca;
//         }

//         return root;
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4;
//         int n2 = 6;

//         System.out.println("LCA: " + lca(root, n1, n2).data);
//     }
// }

// // Min Distance between nodes
// // ***************************************************************
// public class binaryTrees {

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

//     public static Node lca(Node root, int n1, int n2) {
//         if (root == null || root.data == n1 || root.data == n2) {
//             return root;
//         }

//         Node leftLca = lca(root.left, n1, n2);
//         Node rightLca = lca(root.right, n1, n2);

//         if (leftLca == null) {
//             return rightLca;
//         }

//         if (rightLca == null) {
//             return leftLca;
//         }

//         return root;
//     }

//     public static int lcaDist(Node root, int n) {
//         if (root == null) {
//             return -1;
//         }

//         if (root.data == n) {
//             return 0;
//         }

//         int leftDist = lcaDist(root.left, n);
//         int rightDist = lcaDist(root.right, n);

//         if (leftDist == -1 && rightDist == -1) {
//             return -1;
//         } else if (leftDist == -1) {
//             return rightDist + 1;
//         } else {
//             return leftDist + 1;
//         }
//     }

//     public static int minDist(Node root, int n1, int n2) {
//         Node lca = lca(root, n1, n2);
//         int dist1 = lcaDist(lca, n1);
//         int dist2 = lcaDist(lca, n2);

//         return dist1 + dist2;

//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4;
//         int n2 = 6;

//         System.out.println("Min Distance: " + minDist(root, n1, n2));
//     }
// }

// // Kth ancestor of a node
// // ***************************************************************
// public class binaryTrees {

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

//     public static int KAncestor(Node root, int n, int k) {
//         if (root == null) {
//             return -1;
//         }

//         if (root.data == n) {
//             return 0;
//         }

//         int leftDist = KAncestor(root.left, n, k);
//         int rightDist = KAncestor(root.right, n, k);

//         if (leftDist == -1 && rightDist == -1) {
//             return -1;
//         }

//         int max = Math.max(leftDist, rightDist);

//         if (max + 1 == k) {
//             System.out.println(root.data);
//         }

//         return max + 1;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n = 5;
//         int k = 2;
//         KAncestor(root, n, k);

//     }
// }

// // Transform to sum tree
// // ***************************************************************

public class binaryTrees {

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

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = (root.left == null) ? 0 : root.left.data;
        int newRight = (root.right == null) ? 0 : root.right.data;

        root.data = leftChild + rightChild + newLeft + newRight;

        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preOrder(root);

    }
}