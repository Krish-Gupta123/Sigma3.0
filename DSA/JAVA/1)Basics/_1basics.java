// //reverse a number

// import java.util.*;

// public class 1basics {
// public static int count_digits(int num) {
// int count = 0;
// while (num != 0) {

// num = num / 10;
// count++;
// }
// return count;

// }

// public static int reverse_number(int num) {
// int rev = 0;

// while (num != 0) {
// int last_digit = num % 10;
// rev = rev * 10 + last_digit;
// num = num / 10;
// }
// return rev;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.println("enter the number : ");
// int x = sc.nextInt();

// System.out.println("no of digits = " + count_digits(x));

// System.out.println("no of digits = " + reverse_number(x));

// sc.close();
// }
// }

// palindrome
// import java.util.*;

// public class _1basics {
// public static boolean palindrome(int n) {
// int rev = 0;
// int num = n;
// while (n != 0) {

// int ld = n % 10;
// rev = rev * 10 + ld;
// n = n / 10;
// }

// if (rev == num) {
// return true;
// } else {
// return false;
// }
// }

// public static void main(String args[])

// {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// if (palindrome(a)) {
// System.out.println("palindrome");
// } else {
// System.out.println("not a palindrome");
// }

// }
// }

// sum of digits of integer

// import java.util.*;

// public class _1basics {
// public static int sum(int n) {
// int sum = 0;
// while (n != 0) {

// int ld = n % 10;
// sum = sum + ld;
// n = n / 10;
// }

// return sum;
// }

// public static void main(String args[])

// {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println("sum of digits of integer = " + sum(a));

// }
// }