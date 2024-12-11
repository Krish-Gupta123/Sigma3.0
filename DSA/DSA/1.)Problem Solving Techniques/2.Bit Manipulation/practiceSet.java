// practiceSet question 1
// what is the value of x^x for any value of x

// import java.util.*;

// public class practiceSet {
// public static void main(String[] args) {
// System.out.println("x^x for any value f x is always = 0");
// // examples
// int a = 4;
// int b = 6;
// int c = 9;
// System.out.println(a ^ a);
// System.out.println(b ^ b);
// System.out.println(c ^ c);
// }
// }

// practiceSet question 2
// swap two numbers without using third variable
// import java.util.*;

// public class practiceSet {
// public static void main(String[] args) {
// int a = 3;
// int b = 5;
// System.out.println("Before Swapping : ");
// System.out.println("a = " + a + " b = " + b);
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;
// System.out.println("After Swapping : ");
// System.out.println("a = " + a + " b = " + b);
// }
// }

// practiceSet question 3
// Add 1 to an integer using bit mainipulation
// (Hint : try using Bitwise NOT operator)

// import java.util.*;

// public class practiceSet {
// public static void main(String[] args) {
// int a = 6;
// System.out.println(a + " + 1 = " + (-~a));

// int b = -4;
// System.out.println(b + " + 1 = " + (-~b));

// int c = 0;
// System.out.println(c + " + 1 = " + (-~c));

// }
// }

// practiceSet question 4
// Covert uppercase characters to lowercase using bits
// (This question is based on a trick pls directly look into the solution along
// with ascii table opened in a new tab)

// import java.util.*;

// public class practiceSet {
// public static void main(String[] args) {
// // convert uppercase char to lowercase
// for (char ch = 'A'; ch <= 'Z'; ch++) {
// System.out.print((char) (ch | ' '));

// }

// }
// }
