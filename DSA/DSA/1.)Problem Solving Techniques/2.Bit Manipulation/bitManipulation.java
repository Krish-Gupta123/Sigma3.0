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
// public static int getIthBit(int n, int i) {
// int bitmask = 1 << i;
// if ((n & bitmask) == 0) {
// return 0;
// } else {
// return 1;
// }
// }

// public static void main(String[] args) {
// System.out.println(getIthBit(10, 2));
// System.out.println(getIthBit(10, 3));
// }
// }

// 2.)Set th bit

// import java.util.*;

// public class bitManipulation {
// public static int setIthBit(int n, int i) {
// int bitmask = 1 << i;
// return (n | bitmask);
// }

// public static void main(String[] args) {
// System.out.println(setIthBit(10, 2));
// }
// }

// 3.)Clear ith bit

// import java.util.*;

// public class bitManipulation {
// public static int clearIthBit(int n, int i) {
// int bitmask = ~(1 << i);
// return n & bitmask;
// }

// public static void main(String[] args) {
// System.out.println(clearIthBit(10, 1));
// }
// }

// update ith bit

// method 1
// import java.util.*;

// public class bitManipulation {
// public static int clearIthBit(int n, int i) {
// int bitmask = ~(1 << i);
// return n & bitmask;
// }

// public static int setIthBit(int n, int i) {
// int bitmask = 1 << i;
// return n | bitmask;
// }

// public static int updateIthBit(int n, int i, int newBit) {
// if (newBit == 0) {
// return clearIthBit(n, i);
// } else {
// return setIthBit(n, i);
// }
// }

// public static void main(String[] args) {
// System.out.println(updateIthBit(10, 4, 1));
// System.out.println(updateIthBit(10, 2, 1));

// }
// }

// method 2

// import java.util.*;

// public class bitManipulation {
// public static int clearIthBit(int n, int i) {
// int bitmask = ~(1 << i);
// return n & bitmask;
// }

// public static int updateIthBit(int n, int i, int newBit) {
// clearIthBit(n, i);
// int bitmask = newBit << i;
// return n | bitmask;
// }

// public static void main(String[] args) {
// System.out.println(updateIthBit(10, 4, 1));
// System.out.println(updateIthBit(10, 2, 1));

// }
// }

// clear last i bits

// import java.util.*;

// public class bitManipulation {
// public static int clearLastIthBit(int n, int i) {
// int bitmask = (~0) << i;
// return n & bitmask;
// }

// public static void main(String[] args) {
// System.out.println(clearLastIthBit(5, 2));
// }
// }

// clear range of bits

// import java.util.*;

// public class bitManipulation {
// public static int clearRangeOfBits(int n, int i, int j) {
// int a = (~0) << (j + 1);
// int b = (1 << i) - 1;

// int bitmask = a | b;
// return n & bitmask;
// }

// public static void main(String[] args) {
// System.out.println(clearRangeOfBits(10, 2, 4));
// }
// }

// check if a number is a power of 2 or not

// import java.util.*;

// public class bitManipulation {
// public static boolean isPowerOfTwo(int n) {
// return (n & (n - 1)) == 0;
// }

// public static void main(String[] args) {
// System.out.println(isPowerOfTwo(8));
// System.out.println(isPowerOfTwo(15));

// }
// }

// count set bit in a number.............(GOOGLE,AMAZON)

// import java.util.*;

// public class bitManipulation {
// public static int countSetBits(int n) {
// int count = 0;
// while (n > 0) {// checking LSB
// if ((n & 1) != 0) {
// count++;
// }
// n = n >> 1;
// }
// return count;
// }

// public static void main(String[] args) {
// System.out.println(countSetBits(16));
// System.out.println(countSetBits(10));
// System.out.println(countSetBits(15));

// }
// }

// Fast exponentiation

// import java.util.*;

// public class bitManipulation {

// public static int fastExponentiation(int a, int n)// eg .... if 5^2 then a=
// 5,n= 2
// {
// int ans = 1;
// while (n > 0) {
// if ((n & 1) != 0) {
// ans = ans * a;
// }
// a = a * a;
// n = n >> 1;
// }
// return ans;
// }

// public static void main(String[] args) {
// System.out.println(fastExponentiation(5, 3));
// System.out.println(fastExponentiation(3, 5));

// }
// }
