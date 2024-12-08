// //BITWISE OPERATORS: AND,OR,XOR,1'S COMPLEMENT,LEFT SHIFT,RIGHT SHIFT

// import java.util.*;

// public class bitManipulation {
// public static void main(String[] args) {
// System.out.println("BitWise operators : ");
// System.out.println("AND : " + (5 & 6));
// System.out.println("OR : " + (5 | 6));
// System.out.println("XOR : " + (5 ^ 6));
// System.out.println("BINARY 1's COMPLEMENT : " + (~5) + " , " + (~0));
// System.out.println("BINARY LEFT SHIFT : " + (5 << 2));
// System.out.println("BINARY RIGHT SHIFT : " + (6 >> 1));
// }
// }

// check if odd or even

// import java.util.*;

// public class bitManipulation {

// public static void oddOrEven(int n) {
// int bitmask = 1;
// if ((n & bitmask) == 0) {
// // even case
// System.out.println("Even");
// } else {
// // odd case
// System.out.println("Odd");
// }
// }

// public static void main(String[] args) {
// oddOrEven(1);
// oddOrEven(4);
// oddOrEven(8);
// oddOrEven(999);
// }
// }

// operations :
// 1.)Get ith bit
// 2.)Set th bit
// 3.)Clear ith bit

// 1.)Get ith bit

// import java.util.*;

// public class bitManipulation {
//     public static int getIthBit(int n, int i) {
//         int bitmask = 1 << i;
//         if ((n & bitmask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(getIthBit(10, 2));
//         System.out.println(getIthBit(10, 3));
//     }
// }

// 2.)Set th bit

// import java.util.*;

// public class bitManipulation {
//     public static int setIthBit(int n, int i) {
//         int bitmask = 1 << i;
//         return (n | bitmask);
//     }

//     public static void main(String[] args) {
//         System.out.println(setIthBit(10, 2));
//     }
// }

// 3.)Clear ith bit

// import java.util.*;

// public class bitManipulation {
//     public static int clearIthBit(int n, int i) {
//         int bitmask = ~(1 << i);
//         return n & bitmask;
//     }

//     public static void main(String[] args) {
//         System.out.println(clearIthBit(10, 1));
//     }
// }

//update ith bit

import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {

    }
}

// clear last i bits

// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }

// clear range of bits

// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }

// check if a number is a power of 2 or not

// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }

// count set bit in a number.............(GOOGLE,AMAZON)

// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }

// Fast exponentiation

// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }

//
// import java.util.*;

// public class bitManipulation{
// public static void main(String[] args) {

// }
// }
