// question 1

// public class practiceSet {

// public static void allOccurances(int[] arr, int key, int index) {
// if (index == arr.length) {
// return;
// }

// if (arr[index] == key) {
// System.out.print(index + " ");
// }

// allOccurances(arr, key, index + 1);
// }

// public static void main(String[] args) {
// int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
// int key = 2;
// allOccurances(arr, key, 0);
// }
// }

// question 2

// public class practiceSet {

// static String[] digits = { "zero", "one", "two", "three", "four", "five",
// "six", "seven", "eight", "nine" };

// public static void printDigits(int n) {
// if (n == 0) {
// return;
// }

// int lastDigit = n % 10;
// printDigits(n / 10);
// System.out.print(digits[lastDigit] + " ");
// }

// public static void main(String[] args) {
// printDigits(1234);
// }
// }

// question 3

// public class practiceSet {

// public static int length(String str) {
// // if (str.length() == 0) {
// // return 0;
// // }

// // or

// if (str.equals("")) {
// return 0;
// }

// return length(str.substring(1)) + 1;
// }

// public static void main(String[] args) {

// String str = "abcde";
// System.out.println("length = " + length(str));
// }
// }

// question 4

// public class practiceSet {

// static int count = 0;

// public static void countSubstrings(String str, int i, int j) {
// if (i == str.length() - 1) {
// // System.out.println(str.substring(i, j + 1)); // ......to print substring
// if (str.charAt(i) == str.charAt(j)) {
// count++;
// }
// return;
// }
// if (j == str.length() - 1) {
// // System.out.println(str.substring(i, j + 1)); // ......to print substring
// if (str.charAt(i) == str.charAt(j)) {
// count++;
// }
// countSubstrings(str, i + 1, i + 1);
// return;
// }
// // System.out.println(str.substring(i, j + 1)); // ......to print substring
// if (str.charAt(i) == str.charAt(j)) {
// count++;
// }
// countSubstrings(str, i, j + 1);
// }

// public static void main(String[] args) {
// String str = "aba";
// int n = str.length();
// countSubstrings(str, 0, 0);
// System.out.println("count = " + count);
// }
// }

// question 5

// public class practiceSet {

// public static void towerOfHanoi(int n, String src, String helper, String
// dest) {
// if (n == 1) {
// System.out.println("transfer disc " + n + " from " + src + " to " + dest);
// return;
// }

// // transfer top n-1 disc from src to helper using dest as 'helper'
// towerOfHanoi(n - 1, src, dest, helper);

// // transfer nth disc from src to dest
// System.out.println("transfer disc " + n + " from " + src + " to " + dest);

// // transfer n-1 disc from helper to src using src as 'helper'
// towerOfHanoi(n - 1, helper, src, dest);
// }

// public static void main(String[] args) {
// int n = 4;
// towerOfHanoi(n, "A", "B", "C");
// }
// }