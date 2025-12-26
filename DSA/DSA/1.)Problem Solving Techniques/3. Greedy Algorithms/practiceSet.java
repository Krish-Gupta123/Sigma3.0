// // paractice question 1 ***************************************

// public class practiceSet {

// public static int BalancedPartition(String s, int n) {

// if (n == 0) {
// return 0;
// }
// int l = 0;
// int r = 0;
// int count = 0;

// for (char ch : s.toCharArray()) {
// if (ch == 'L') {
// l++;
// } else {
// r++;
// }

// if (l == r) {
// count++;
// }
// }

// return count;

// }

// public static void main(String[] args) {
// String str = "LRRRRLLRLLRL";
// int n = str.length();
// System.out.print(BalancedPartition(str, n));
// }
// }

// // practice question 2 ***************************************

// public class practiceSet {

// public static int KthOdd(int L, int R, int k) {
// int totalNumbers = R - L + 1;
// int numberOfOddNumbers;

// if ((L % 2 != 0) && (R % 2 != 0)) {
// numberOfOddNumbers = (totalNumbers / 2) + 1;
// } else {
// numberOfOddNumbers = totalNumbers / 2;
// }

// if (k > numberOfOddNumbers) {
// return 0; // we dont have enough numbers
// }

// int largest_value;

// if (R % 2 != 0) {
// largest_value = R;
// } else {
// largest_value = R - 1;
// }

// return largest_value - 2 * (k - 1);
// }

// public static void main(String args[]) {
// int k = 2;
// System.out.println(KthOdd(-3, 3, k));
// }
// }

// // practice question 3 ***************************************

// public class practiceSet {

// public static String getSmallestString(int n, int k) {
// char[] arr = new char[n];

// // step 1 : subtract the minimum required value(all 'a')
// k -= n;

// // step 2 : fill from the end
// for (int i = n - 1; i >= 0; i--) {

// // we can add at most +25 (to convert 'a' -> 'z')
// int add = Math.min(25, k);

// arr[i] = (char) ('a' + add);

// k -= add;
// }

// return new String(arr);
// }

// public static void main(String args[]) {
// int n = 5;
// int k = 42;
// System.out.println(getSmallestString(n, k));
// }
// }

// // practice question 4 ***************************************

// public class practiceSet {
// public static void main(String[] args) {
// int prices[] = { 7, 1, 5, 3, 6, 4 };

// int res = 0;
// int min = prices[0];

// for (int i = 0; i < prices.length; i++) {
// if (prices[i] < min) {
// min = prices[i];
// }

// res = Math.max(res, prices[i] - min);
// }

// System.out.println("maximum profit : " + res);
// }
// }