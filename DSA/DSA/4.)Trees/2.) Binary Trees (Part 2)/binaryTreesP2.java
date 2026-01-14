// // Diameter of a Binary Tree ..... brute force approach
// // *******************************************************************************************

// public class binaryTreesP2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root) {
//         if (root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter(Node root) { // O(N^2)
//         if (root == null) {
//             return 0;
//         }

//         // ld = left diameter , rd = right diameter ,lh = left height , rh = right
//         // height

//         int ld = diameter(root.left);
//         int rd = diameter(root.right);
//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh + rh + 1, Math.max(ld, rd));
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root));
//     }
// }

// // Diameter of a Binary Tree ..... optimised approach
// // *******************************************************************************************

// public class binaryTreesP2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Info {
//         int diameter;
//         int height;

//         Info(int diameter, int height) {
//             this.diameter = diameter;
//             this.height = height;
//         }
//     }

//     public static Info diameter(Node root) { // O(N)
//         if (root == null) {
//             return new Info(0, 0);
//         }

//         // ld = left diameter , rd = right diameter ,lh = left height , rh = right
//         // height

//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diameter = Math.max(leftInfo.height + rightInfo.height + 1,
//                 Math.max(leftInfo.diameter, rightInfo.diameter));
//         int height = Math.max(leftInfo.height, rightInfo.height) + 1;

//         return new Info(diameter, height);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root).diameter);
//         System.out.println(diameter(root).height);
//     }
// }

// // Subtree of Another Tree
// // *******************************************************************************************

// public class binaryTreesP2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean isIdentical(Node root, Node subroot) {
//         if (root == null && subroot == null) {
//             return true;
//         }

//         if (root == null || subroot == null || root.data != subroot.data) {
//             return false;
//         }

//         if (!isIdentical(root.left, subroot.left)) {
//             return false;
//         }

//         if (!isIdentical(root.right, subroot.right)) {
//             return false;
//         }

//         return true;
//     }

//     public static boolean isSubtree(Node root, Node subroot) {
//         if (root == null) {
//             return false;
//         }

//         if (root.data == subroot.data) {
//             if (isIdentical(root, subroot)) {
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.left = new Node(6);
// root.right.right = new Node(7);

//         Node subroot = new Node(2);
//         subroot.left = new Node(4);
//         subroot.right = new Node(5);

//         System.out.println(isSubtree(root, subroot));
//     }
// }

// Top view of a Tree
// *******************************************************************************************

import java.util.*;

public class binaryTreesP2 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd; // horizontal distance

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topview(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) { // 1st time my hd is occuring
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topview(root);
    }
}
